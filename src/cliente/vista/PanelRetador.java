package cliente.vista;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import cliente.modelo.Imagen;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelRetador extends JPanel {

	protected Imagen imagen0, imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10,
			imagen11, imagen12, imagen13, imagen14, imagen15, imagen16, imagen17, imagen18, imagen19;

	public PanelRetador() {
		initComponents();
	}

	private void initComponents() {
		setSize(800, 520);
		setLayout(null);
		setVisible(true);

		colocarImagenes();
	}

	private void colocarImagenes() {
		imagen0 = new Imagen(0);
		imagen0.setBounds(91, 64, 50, 50);
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/0.png"));
		Icon backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen0.getWidth(),
				imagen0.getHeight(), Image.SCALE_DEFAULT));
		imagen0.setIcon(backgroundIcono);
		add(imagen0);

		imagen1 = new Imagen(1);
		imagen1.setBounds(232, 64, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/1.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen1.getWidth(),
				imagen1.getHeight(), Image.SCALE_DEFAULT));
		imagen1.setIcon(backgroundIcono);
		add(imagen1);

		imagen2 = new Imagen(2);
		imagen2.setBounds(373, 64, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/2.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen2.getWidth(),
				imagen2.getHeight(), Image.SCALE_DEFAULT));
		imagen2.setIcon(backgroundIcono);
		add(imagen2);

		imagen3 = new Imagen(3);
		imagen3.setBounds(514, 64, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/3.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen3.getWidth(),
				imagen3.getHeight(), Image.SCALE_DEFAULT));
		imagen3.setIcon(backgroundIcono);
		add(imagen3);

		imagen4 = new Imagen(4);
		imagen4.setBounds(655, 64, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/4.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen4.getWidth(),
				imagen4.getHeight(), Image.SCALE_DEFAULT));
		imagen4.setIcon(backgroundIcono);
		add(imagen4);

		imagen5 = new Imagen(5);
		imagen5.setBounds(91, 125, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/5.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen5.getWidth(),
				imagen5.getHeight(), Image.SCALE_DEFAULT));
		imagen5.setIcon(backgroundIcono);
		add(imagen5);

		imagen6 = new Imagen(6);
		imagen6.setBounds(232, 125, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/6.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen6.getWidth(),
				imagen6.getHeight(), Image.SCALE_DEFAULT));
		imagen6.setIcon(backgroundIcono);
		add(imagen6);

		imagen7 = new Imagen(7);
		imagen7.setBounds(373, 125, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/7.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen7.getWidth(),
				imagen7.getHeight(), Image.SCALE_DEFAULT));
		imagen7.setIcon(backgroundIcono);
		add(imagen7);

		imagen8 = new Imagen(8);
		imagen8.setBounds(514, 125, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/8.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen8.getWidth(),
				imagen8.getHeight(), Image.SCALE_DEFAULT));
		imagen8.setIcon(backgroundIcono);
		add(imagen8);

		imagen9 = new Imagen(9);
		imagen9.setBounds(655, 125, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/9.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen9.getWidth(),
				imagen9.getHeight(), Image.SCALE_DEFAULT));
		imagen9.setIcon(backgroundIcono);
		add(imagen9);

		imagen10 = new Imagen(10);
		imagen10.setBounds(91, 186, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/10.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen10.getWidth(),
				imagen10.getHeight(), Image.SCALE_DEFAULT));
		imagen10.setIcon(backgroundIcono);
		add(imagen10);

		imagen11 = new Imagen(11);
		imagen11.setBounds(232, 186, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/11.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen11.getWidth(),
				imagen11.getHeight(), Image.SCALE_DEFAULT));
		imagen11.setIcon(backgroundIcono);
		add(imagen11);

		imagen12 = new Imagen(12);
		imagen12.setBounds(373, 186, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/12.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen12.getWidth(),
				imagen12.getHeight(), Image.SCALE_DEFAULT));
		imagen12.setIcon(backgroundIcono);
		add(imagen12);

		imagen13 = new Imagen(13);
		imagen13.setBounds(514, 186, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/13.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen13.getWidth(),
				imagen13.getHeight(), Image.SCALE_DEFAULT));
		imagen13.setIcon(backgroundIcono);
		add(imagen13);

		imagen14 = new Imagen(14);
		imagen14.setBounds(655, 186, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/14.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen14.getWidth(),
				imagen14.getHeight(), Image.SCALE_DEFAULT));
		imagen14.setIcon(backgroundIcono);
		add(imagen14);

		imagen15 = new Imagen(15);
		imagen15.setBounds(91, 247, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/15.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen15.getWidth(),
				imagen15.getHeight(), Image.SCALE_DEFAULT));
		imagen15.setIcon(backgroundIcono);
		add(imagen15);

		imagen16 = new Imagen(16);
		imagen16.setBounds(232, 247, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/16.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen16.getWidth(),
				imagen16.getHeight(), Image.SCALE_DEFAULT));
		imagen16.setIcon(backgroundIcono);
		add(imagen16);

		imagen17 = new Imagen(17);
		imagen17.setBounds(373, 247, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/17.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen17.getWidth(),
				imagen17.getHeight(), Image.SCALE_DEFAULT));
		imagen17.setIcon(backgroundIcono);
		add(imagen17);

		imagen18 = new Imagen(18);
		imagen18.setBounds(514, 247, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/18.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen18.getWidth(),
				imagen18.getHeight(), Image.SCALE_DEFAULT));
		imagen18.setIcon(backgroundIcono);
		add(imagen18);

		imagen19 = new Imagen(19);
		imagen19.setBounds(655, 247, 50, 50);
		backgroundImage = new ImageIcon(getClass().getResource("/cliente/images/19.png"));
		backgroundIcono = new ImageIcon(backgroundImage.getImage().getScaledInstance(imagen19.getWidth(),
				imagen19.getHeight(), Image.SCALE_DEFAULT));
		imagen19.setIcon(backgroundIcono);
		add(imagen19);

		JLabel lblDeClickEn = new JLabel("De click en una imagen para preguntar a tu compa\u00F1ero.");
		lblDeClickEn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeClickEn.setBounds(91, 391, 614, 14);
		add(lblDeClickEn);
	}
}
