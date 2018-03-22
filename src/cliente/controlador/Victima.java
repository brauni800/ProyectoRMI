package cliente.controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import cliente.vista.PanelVictima;
import interfaces.InterfazCliente;
import interfaces.InterfazServidor;

@SuppressWarnings("serial")
public class Victima extends PanelVictima implements ActionListener, InterfazCliente {
	
	private final String NOMBRE_SERVIDOR = "SERVIDOR", GANADOR = "GANADOR", PERDEDOR = "PERDEDOR";

	public Victima() {
		initEvents();
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		String comando = ev.getActionCommand();
		try {
			responderRegistro(comando);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			e1.printStackTrace();
		}
	}

	private void initEvents() {
		super.btnAquaman.addActionListener(this);
		super.btnAquaman.setActionCommand(String.valueOf(btnAquaman.getId()));
		
		super.btnAttackOnTitan.addActionListener(this);
		super.btnAttackOnTitan.setActionCommand(String.valueOf(btnAttackOnTitan.getId()));
		
		super.btnBatman.addActionListener(this);
		super.btnBatman.setActionCommand(String.valueOf(btnBatman.getId()));
		
		super.btnBleach.addActionListener(this);
		super.btnBleach.setActionCommand(String.valueOf(btnBleach.getId()));
		
		super.btnCaptainAmerica.addActionListener(this);
		super.btnCaptainAmerica.setActionCommand(String.valueOf(btnCaptainAmerica.getId()));
		
		super.btnDigimon.addActionListener(this);
		super.btnDigimon.setActionCommand(String.valueOf(btnDigimon.getId()));
		
		super.btnDragonBall.addActionListener(this);
		super.btnDragonBall.setActionCommand(String.valueOf(btnDragonBall.getId()));
		
		super.btnFairyTail.addActionListener(this);
		super.btnFairyTail.setActionCommand(String.valueOf(btnFairyTail.getId()));
		
		super.btnFantasticFour.addActionListener(this);
		super.btnFantasticFour.setActionCommand(String.valueOf(btnFantasticFour.getId()));
		
		super.btnHombreAraa.addActionListener(this);
		super.btnHombreAraa.setActionCommand(String.valueOf(btnHombreAraa.getId()));
		
		super.btnIronMan.addActionListener(this);
		super.btnIronMan.setActionCommand(String.valueOf(btnIronMan.getId()));
		
		super.btnLinternaVerde.addActionListener(this);
		super.btnLinternaVerde.setActionCommand(String.valueOf(btnLinternaVerde.getId()));
		
		super.btnMujerMaravilla.addActionListener(this);
		super.btnMujerMaravilla.setActionCommand(String.valueOf(btnMujerMaravilla.getId()));
		
		super.btnNaruto.addActionListener(this);
		super.btnNaruto.setActionCommand(String.valueOf(btnNaruto.getId()));
		
		super.btnOnePiece.addActionListener(this);
		super.btnOnePiece.setActionCommand(String.valueOf(btnOnePiece.getId()));
		
		super.btnPokemon.addActionListener(this);
		super.btnPokemon.setActionCommand(String.valueOf(btnPokemon.getId()));
		
		super.btnPunisher.addActionListener(this);
		super.btnPunisher.setActionCommand(String.valueOf(btnPunisher.getId()));
		
		super.btnRobin.addActionListener(this);
		super.btnRobin.setActionCommand(String.valueOf(btnRobin.getId()));
		
		super.btnSuperman.addActionListener(this);
		super.btnSuperman.setActionCommand(String.valueOf(btnSuperman.getId()));
		
		super.btnXmen.addActionListener(this);
		super.btnXmen.setActionCommand(String.valueOf(btnXmen.getId()));
	}
	
	private void responderRegistro(String id) throws RemoteException, NotBoundException {
		Registry registro = LocateRegistry.getRegistry();
		InterfazServidor servidor = (InterfazServidor) registro.lookup(NOMBRE_SERVIDOR);
		servidor.preguntar(Integer.parseInt(id));
	}

	@Override
	public void cambiarVentana(String nombreVentana) throws RemoteException {}

	@Override
	public void colocarImagen(int id) throws RemoteException {
		String imagen_url = "/cliente/images/" + String.valueOf(id) + ".png";
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource(imagen_url));
		Icon backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(super.imagen.getWidth(),
				super.imagen.getHeight(), Image.SCALE_DEFAULT));
		super.imagen.setIcon(backgroundIcono);
	}

	@Override
	public void mostrarMensaje(String tipo) throws RemoteException {
		switch (tipo) {
		case GANADOR:
			JOptionPane.showMessageDialog(null, "Respuesta correcta", "Bien", JOptionPane.OK_OPTION);
			break;
		case PERDEDOR:
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "Mal", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

}
