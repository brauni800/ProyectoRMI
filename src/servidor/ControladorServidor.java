package servidor;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import interfaces.InterfazCliente;
import interfaces.InterfazServidor;

@SuppressWarnings("serial")
public class ControladorServidor extends UnicastRemoteObject implements InterfazServidor, Runnable {

	private final String NOMBRE_SERVIDOR = "SERVIDOR", VENTANA_RETADOR = "VENTANA_RETADOR",
			VENTANA_VICTIMA = "VENTANA_VICTIMA", GANADOR = "GANADOR", PERDEDOR = "PERDEDOR";
	private ArrayList<String> usuarios;
	private boolean esperando = true, primerTurno = true;
	private InterfazCliente instanciaClienteRetador, instanciaClienteVictima;
	private int pregunta;

	public ControladorServidor() throws RemoteException {
		super();
		this.usuarios = new ArrayList<>();
	}

	@Override
	public void login(String user) throws RemoteException {
		this.usuarios.add(user);
	}

	@Override
	public void preguntar(int id) throws RemoteException {
		if (primerTurno) {
			pregunta = id;
			instanciaClienteVictima.colocarImagen(id);
			primerTurno = false;
		}
	}

	@Override
	public void responder(int respuesta) throws RemoteException {
		if (!primerTurno) {
			primerTurno = true;
			if (pregunta == respuesta) {
				instanciaClienteRetador.mostrarMensaje(PERDEDOR);
				instanciaClienteVictima.mostrarMensaje(GANADOR);
			} else {
				instanciaClienteRetador.mostrarMensaje(GANADOR);
				instanciaClienteVictima.mostrarMensaje(PERDEDOR);
			}
		}
	}

	@Override
	public void run() {
		while (esperando) {
			try {
				if (this.usuarios.size() == 2) {
					if (primerTurno) {
						String retador = this.usuarios.get(0);
						primerTurno = false;
						Registry registro = LocateRegistry.getRegistry();
						instanciaClienteRetador = (InterfazCliente) registro.lookup(retador);
						instanciaClienteRetador.cambiarVentana(VENTANA_RETADOR);
					} else {
						String victima = this.usuarios.get(1);
						primerTurno = true;
						Registry registro = LocateRegistry.getRegistry();
						instanciaClienteVictima = (InterfazCliente) registro.lookup(victima);
						instanciaClienteVictima.cambiarVentana(VENTANA_VICTIMA);
					}
				}
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (NotBoundException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void inicializarObjetoRemoto() {
		try {
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(NOMBRE_SERVIDOR, (InterfazServidor) this);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
