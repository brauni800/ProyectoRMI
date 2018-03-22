package cliente.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import cliente.vista.PanelRegistro;
import cliente.vista.VentanaCliente;
import interfaces.InterfazCliente;
import interfaces.InterfazServidor;

@SuppressWarnings("serial")
public class Registro extends UnicastRemoteObject implements ActionListener, InterfazCliente {
	
	private final String NOMBRE_SERVIDOR = "SERVIDOR", VENTANA_RETADOR = "VENTANA_RETADOR",
			VENTANA_VICTIMA = "VENTANA_VICTIMA";
	private final String INGRESAR = "INGRESAR";
	private PanelRegistro panel;
	private VentanaCliente view;

	public Registro(VentanaCliente view) throws RemoteException {
		super();
		this.panel = new PanelRegistro();
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		String comando = ev.getActionCommand();
		switch(comando) {
		case INGRESAR:
			try {
				Registry registro = LocateRegistry.getRegistry();
				InterfazServidor servidor = (InterfazServidor) registro.lookup(NOMBRE_SERVIDOR);
				servidor.login(this.panel.getTextField().getText());
			} catch (RemoteException e1) {
				e1.printStackTrace();
			} catch (NotBoundException e1) {
				e1.printStackTrace();
			}
			break;
		}
	}

	private void initEvents() {
		this.panel.getBtnIngresar().addActionListener(this);
		this.panel.getBtnIngresar().setActionCommand(INGRESAR);
	}
	
	public void inicializarObjetoRemoto() {
		try {
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(this.panel.getTextField().getText(), (InterfazCliente) this);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public PanelRegistro getPanel() {
		return panel;
	}

	@Override
	public void cambiarVentana(String nombreVentana) throws RemoteException {
		switch(nombreVentana) {
		case VENTANA_RETADOR:
			this.view.setPanel(new Retador());
			break;
		case VENTANA_VICTIMA:
			this.view.setPanel(new Victima());
			break;
		}
	}

	@Override
	public void colocarImagen(int id) throws RemoteException {}

	@Override
	public void mostrarMensaje(String tipo) throws RemoteException {}
	
}
