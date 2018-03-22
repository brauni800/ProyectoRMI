package cliente.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelRegistro extends JPanel {
	private JTextField textField;
	private JLabel lblIngreseUnNombre;
	private JButton btnIngresar;
	
	public PanelRegistro() {
		initComponents();
	}

	private void initComponents() {
		setSize(800, 520);
		setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(250, 250, 300, 20);
		add(textField);
		textField.setColumns(10);
		
		lblIngreseUnNombre = new JLabel("Ingrese un nombre de usuario:");
		lblIngreseUnNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseUnNombre.setBounds(250, 200, 300, 14);
		add(lblIngreseUnNombre);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(350, 290, 100, 23);
		add(btnIngresar);
	}

	public JTextField getTextField() {
		return textField;
	}

	public JLabel getLblIngreseUnNombre() {
		return lblIngreseUnNombre;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}
	
}
