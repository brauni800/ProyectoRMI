package cliente.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import cliente.modelo.Imagen;

@SuppressWarnings("serial")
public class PanelVictima extends JPanel {
	
	protected JLabel imagen, pregunta;
	protected Imagen btnSuperman, btnBatman, btnMujerMaravilla, btnLinternaVerde, btnHombreAraa, btnDragonBall,
	btnNaruto, btnOnePiece, btnFairyTail, btnBleach, btnPunisher, btnXmen, btnPokemon, btnRobin, btnAquaman,
	btnIronMan, btnFantasticFour, btnAttackOnTitan, btnDigimon, btnCaptainAmerica;
	
	public PanelVictima() {
		initComponents();
	}

	private void initComponents() {
		setSize(800, 520);
		setLayout(null);
		setVisible(true);
		
		imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setBounds(325, 49, 150, 150);
		add(imagen);
		
		btnSuperman = new Imagen("Superman", 0);
		btnSuperman.setBounds(31, 336, 125, 23);
		add(btnSuperman);
		
		btnBatman = new Imagen("Batman", 1);
		btnBatman.setBounds(185, 336, 125, 23);
		add(btnBatman);
		
		btnPokemon = new Imagen("Pokemon", 2);
		btnPokemon.setBounds(339, 404, 125, 23);
		add(btnPokemon);
		
		btnHombreAraa = new Imagen("Spiderman", 3);
		btnHombreAraa.setBounds(647, 336, 125, 23);
		add(btnHombreAraa);
		
		btnFantasticFour = new Imagen("Fantastic Four", 4);
		btnFantasticFour.setBounds(185, 438, 125, 23);
		add(btnFantasticFour);
		
		btnLinternaVerde = new Imagen("Green Lantern", 5);
		btnLinternaVerde.setBounds(493, 336, 125, 23);
		add(btnLinternaVerde);
		
		btnPunisher = new Imagen("Punisher", 6);
		btnPunisher.setBounds(647, 370, 125, 23);
		add(btnPunisher);
		
		btnIronMan = new Imagen("Iron Man", 7);
		btnIronMan.setBounds(31, 438, 125, 23);
		add(btnIronMan);
		
		btnOnePiece = new Imagen("One Piece", 8);
		btnOnePiece.setBounds(185, 370, 125, 23);
		add(btnOnePiece);
		
		btnNaruto = new Imagen("Naruto", 9);
		btnNaruto.setBounds(31, 370, 125, 23);
		add(btnNaruto);
		
		btnBleach = new Imagen("Bleach", 10);
		btnBleach.setBounds(493, 370, 125, 23);
		add(btnBleach);
		
		btnFairyTail = new Imagen("Fairy Tail", 11);
		btnFairyTail.setBounds(339, 370, 125, 23);
		add(btnFairyTail);
		
		btnMujerMaravilla = new Imagen("Wonder Woman", 12);
		btnMujerMaravilla.setBounds(339, 336, 125, 23);
		add(btnMujerMaravilla);
		
		btnCaptainAmerica = new Imagen("Captain America", 13);
		btnCaptainAmerica.setBounds(647, 438, 125, 23);
		add(btnCaptainAmerica);
		
		btnXmen = new Imagen("X Men", 14);
		btnXmen.setBounds(493, 404, 125, 23);
		add(btnXmen);
		
		btnDragonBall = new Imagen("Dragon Ball", 15);
		btnDragonBall.setBounds(647, 404, 125, 23);
		add(btnDragonBall);
		
		btnAquaman = new Imagen("Aquaman", 16);
		btnAquaman.setBounds(31, 404, 125, 23);
		add(btnAquaman);
		
		btnRobin = new Imagen("Robin", 17);
		btnRobin.setBounds(185, 404, 125, 23);
		add(btnRobin);
		
		btnAttackOnTitan = new Imagen("Attack on Titan", 18);
		btnAttackOnTitan.setBounds(339, 438, 125, 23);
		add(btnAttackOnTitan);
		
		btnDigimon = new Imagen("Digimon", 19);
		btnDigimon.setBounds(493, 438, 125, 23);
		add(btnDigimon);
		
		pregunta = new JLabel("\u00BFA que franquicia pertenece este logo?");
		pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		pregunta.setBounds(185, 259, 433, 14);
		add(pregunta);
		
	}
}
