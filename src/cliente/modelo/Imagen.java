package cliente.modelo;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Imagen extends JButton {
	
	private int id;
	
	public Imagen(int id) {
		this.id = id;
	}
	
	public Imagen(String text, int id) {
		super(text);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
