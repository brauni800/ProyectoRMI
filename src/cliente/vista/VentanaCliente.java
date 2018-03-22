package cliente.vista;

import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import cliente.controlador.Registro;

@SuppressWarnings("serial")
public class VentanaCliente extends JFrame {
	
	private JPanel panel;
	
	public VentanaCliente() {
		try {
			initComponents();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println(getContentPane().getSize());
	}

	private void initComponents() throws RemoteException {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(806, 549);
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		
		panel = new Registro(this).getPanel();
		getContentPane().add(panel);
		repaint();
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
		repaint();
	}
}
