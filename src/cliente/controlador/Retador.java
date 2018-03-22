package cliente.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import cliente.vista.PanelRetador;
import interfaces.InterfazCliente;
import interfaces.InterfazServidor;

@SuppressWarnings("serial")
public class Retador extends PanelRetador implements ActionListener, InterfazCliente {

	private final String NOMBRE_SERVIDOR = "SERVIDOR", GANADOR = "GANADOR", PERDEDOR = "PERDEDOR";

	public Retador() {
		initEvents();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		String comando = ev.getActionCommand();
		try {
			preguntarRegistro(comando);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			e1.printStackTrace();
		}
	}

	private void initEvents() {
		super.imagen0.addActionListener(this);
		super.imagen0.setActionCommand(String.valueOf(imagen0.getId()));

		super.imagen1.addActionListener(this);
		super.imagen1.setActionCommand(String.valueOf(imagen1.getId()));

		super.imagen2.addActionListener(this);
		super.imagen2.setActionCommand(String.valueOf(imagen2.getId()));

		super.imagen3.addActionListener(this);
		super.imagen3.setActionCommand(String.valueOf(imagen3.getId()));

		super.imagen4.addActionListener(this);
		super.imagen4.setActionCommand(String.valueOf(imagen4.getId()));

		super.imagen5.addActionListener(this);
		super.imagen5.setActionCommand(String.valueOf(imagen5.getId()));

		super.imagen6.addActionListener(this);
		super.imagen6.setActionCommand(String.valueOf(imagen6.getId()));

		super.imagen7.addActionListener(this);
		super.imagen7.setActionCommand(String.valueOf(imagen7.getId()));

		super.imagen8.addActionListener(this);
		super.imagen8.setActionCommand(String.valueOf(imagen8.getId()));

		super.imagen9.addActionListener(this);
		super.imagen9.setActionCommand(String.valueOf(imagen9.getId()));

		super.imagen10.addActionListener(this);
		super.imagen10.setActionCommand(String.valueOf(imagen10.getId()));

		super.imagen11.addActionListener(this);
		super.imagen11.setActionCommand(String.valueOf(imagen11.getId()));

		super.imagen12.addActionListener(this);
		super.imagen12.setActionCommand(String.valueOf(imagen12.getId()));

		super.imagen13.addActionListener(this);
		super.imagen13.setActionCommand(String.valueOf(imagen13.getId()));

		super.imagen14.addActionListener(this);
		super.imagen14.setActionCommand(String.valueOf(imagen14.getId()));

		super.imagen15.addActionListener(this);
		super.imagen15.setActionCommand(String.valueOf(imagen15.getId()));

		super.imagen16.addActionListener(this);
		super.imagen16.setActionCommand(String.valueOf(imagen16.getId()));

		super.imagen17.addActionListener(this);
		super.imagen17.setActionCommand(String.valueOf(imagen17.getId()));

		super.imagen18.addActionListener(this);
		super.imagen18.setActionCommand(String.valueOf(imagen18.getId()));

		super.imagen19.addActionListener(this);
		super.imagen19.setActionCommand(String.valueOf(imagen19.getId()));
	}

	private void preguntarRegistro(String id) throws NumberFormatException, RemoteException, NotBoundException {
		Registry registro = LocateRegistry.getRegistry();
		InterfazServidor servidor = (InterfazServidor) registro.lookup(NOMBRE_SERVIDOR);
		servidor.preguntar(Integer.parseInt(id));
	}

	@Override
	public void cambiarVentana(String nombreVentana) throws RemoteException {}

	@Override
	public void colocarImagen(int id) throws RemoteException {}

	@Override
	public void mostrarMensaje(String tipo) throws RemoteException {
		switch (tipo) {
		case GANADOR:
			JOptionPane.showMessageDialog(null, "No adivinaron tu imagen", "Bien", JOptionPane.OK_OPTION);
			break;
		case PERDEDOR:
			JOptionPane.showMessageDialog(null, "Adivinaron tu imagen", "Mal", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
}
