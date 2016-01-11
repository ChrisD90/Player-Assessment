package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JButton;

import model.Player;

import java.awt.Font;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Frame_EditPlayer_Taktik extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	LinkedList<Player> db;
	Player p;

	double[] tech = new double[7];
	int[] slider_tech = new int[7];

	/**
	 * Create the frame.
	 */
	public Frame_EditPlayer_Taktik(LinkedList<Player> db, Player p) {
		
		this.p = p;
		
		setResizable(false);
		setTitle("Edit Player");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_EditPlayer_Taktik.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(12, 83, 71, 16);
		contentPane.add(lblVorname);

		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(12, 125, 71, 16);
		contentPane.add(lblNachname);

		JButton btnOk = new JButton("SAVE");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk.setBounds(692, 535, 92, 25);
		contentPane.add(btnOk);

		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum");
		lblGeburtsdatum.setBounds(10, 167, 83, 14);
		contentPane.add(lblGeburtsdatum);

		JLabel lblPerson = new JLabel("Person");
		lblPerson.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerson.setBounds(10, 30, 73, 22);
		contentPane.add(lblPerson);

		JLabel lblTaktik = new JLabel("Taktik");
		lblTaktik.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTaktik.setBounds(295, 30, 73, 22);
		contentPane.add(lblTaktik);

		JLabel lblBallanUndMitnahme = new JLabel("1:1 offensiv");
		lblBallanUndMitnahme.setBounds(295, 84, 123, 14);
		contentPane.add(lblBallanUndMitnahme);

		JLabel lblPassspiel = new JLabel("1:1 defensiv");
		lblPassspiel.setBounds(295, 126, 123, 14);
		contentPane.add(lblPassspiel);

		JLabel lblDribbling = new JLabel("Gruppentaktisch offensiv");
		lblDribbling.setBounds(295, 168, 123, 14);
		contentPane.add(lblDribbling);

		JLabel lblBeidfigkeit = new JLabel("Gruppentaktisch defensiv");
		lblBeidfigkeit.setBounds(295, 210, 123, 14);
		contentPane.add(lblBeidfigkeit);

		JLabel lblSchusstechnik = new JLabel("Umschalten offensiv");
		lblSchusstechnik.setBounds(295, 294, 123, 14);
		contentPane.add(lblSchusstechnik);

		JSpinner spinner_off1 = new JSpinner();
		spinner_off1
				.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_off1.setBounds(500, 81, 50, 20);
		contentPane.add(spinner_off1);

		JSlider slider_1off = new JSlider();
		slider_1off.setBounds(580, 76, 200, 26);
		contentPane.add(slider_1off);

		JSpinner spinner_def1 = new JSpinner();
		spinner_def1.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_def1.setBounds(500, 123, 50, 20);
		contentPane.add(spinner_def1);

		JSpinner spinner_gruppeoff = new JSpinner();
		spinner_gruppeoff.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_gruppeoff.setBounds(500, 164, 50, 20);
		contentPane.add(spinner_gruppeoff);

		JSpinner spinner_gruppeDef = new JSpinner();
		spinner_gruppeDef.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_gruppeDef.setBounds(500, 207, 50, 20);
		contentPane.add(spinner_gruppeDef);

		JSpinner spinner_umschalt = new JSpinner();
		spinner_umschalt.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_umschalt.setBounds(500, 294, 50, 20);
		contentPane.add(spinner_umschalt);

		JSlider slider_1def = new JSlider();
		slider_1def.setBounds(580, 122, 200, 26);
		contentPane.add(slider_1def);

		JSlider slider_gruppeOff = new JSlider();
		slider_gruppeOff.setBounds(580, 164, 200, 26);
		contentPane.add(slider_gruppeOff);

		JSlider slider_gruppeDef = new JSlider();
		slider_gruppeDef.setBounds(580, 207, 200, 26);
		contentPane.add(slider_gruppeDef);

		JSlider slider_umschaltOff = new JSlider();
		slider_umschaltOff.setBounds(580, 294, 200, 26);
		contentPane.add(slider_umschaltOff);

		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setBounds(295, 504, 46, 14);
		contentPane.add(lblTotal);

		JLabel label_total = new JLabel("---");
		label_total.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_total.setHorizontalAlignment(SwingConstants.CENTER);
		label_total.setBounds(500, 504, 46, 14);
		contentPane.add(label_total);

		JButton btnBack = new JButton("Start");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(12, 537, 107, 23);
		contentPane.add(btnBack);

		JLabel lblKopfball = new JLabel("Freilaufen");
		lblKopfball.setBounds(295, 252, 123, 14);
		contentPane.add(lblKopfball);

		JSpinner spinner_frei = new JSpinner();
		spinner_frei.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_frei.setBounds(500, 249, 50, 20);
		contentPane.add(spinner_frei);

		JSlider slider_frei = new JSlider();
		slider_frei.setBounds(580, 249, 200, 26);
		contentPane.add(slider_frei);
		
		JLabel label_geb = new JLabel(p.getBirthday());
		label_geb.setBounds(103, 167, 128, 14);
		contentPane.add(label_geb);
		
		JLabel label_name = new JLabel(p.getName());
		label_name.setBounds(103, 126, 128, 14);
		contentPane.add(label_name);
		
		JLabel label_vorname = new JLabel(p.getPrename());
		label_vorname.setBounds(103, 84, 128, 14);
		contentPane.add(label_vorname);
		
		JLabel old_1off = new JLabel(""+p.getTaktik_1off());
		old_1off.setBounds(428, 84, 46, 14);
		contentPane.add(old_1off);
		
		JLabel old_1def = new JLabel(""+p.getTaktik_1def());
		old_1def.setBounds(428, 126, 46, 14);
		contentPane.add(old_1def);
		
		JLabel old_groupOff = new JLabel(""+p.getTaktik_gruppeOff());
		old_groupOff.setBounds(428, 167, 46, 14);
		contentPane.add(old_groupOff);
		
		JLabel old_groupDef = new JLabel(""+p.getTaktik_gruppeDef());
		old_groupDef.setBounds(428, 210, 46, 14);
		contentPane.add(old_groupDef);
		
		JLabel old_frei = new JLabel(""+p.getTaktik_freilaufen());
		old_frei.setBounds(428, 252, 46, 14);
		contentPane.add(old_frei);
		
		JLabel old_umOff = new JLabel(""+p.getTaktik_umschaltOff());
		old_umOff.setBounds(428, 294, 46, 14);
		contentPane.add(old_umOff);
		
		JLabel lblUmschaltenDefensiv = new JLabel("Umschalten defensiv");
		lblUmschaltenDefensiv.setBounds(295, 336, 123, 14);
		contentPane.add(lblUmschaltenDefensiv);
		
		JLabel lblZugZumTor = new JLabel("Zug zum Tor");
		lblZugZumTor.setBounds(295, 378, 123, 14);
		contentPane.add(lblZugZumTor);
		
		JLabel lblKreativitt = new JLabel("Kreativit\u00E4t");
		lblKreativitt.setBounds(295, 420, 123, 14);
		contentPane.add(lblKreativitt);
		
		JLabel lblSpielerfahrung = new JLabel("Spielerfahrung");
		lblSpielerfahrung.setBounds(295, 462, 123, 14);
		contentPane.add(lblSpielerfahrung);
		
		JLabel old_umDef = new JLabel(""+p.getTaktik_umschaltDef());
		old_umDef.setBounds(428, 336, 46, 14);
		contentPane.add(old_umDef);
		
		JLabel old_zug = new JLabel(""+p.getTaktik_zugZumTor());
		old_zug.setBounds(428, 378, 46, 14);
		contentPane.add(old_zug);
		
		JLabel old_kreat = new JLabel(""+p.getTaktik_kreativität());
		old_kreat.setBounds(428, 420, 46, 14);
		contentPane.add(old_kreat);
		
		JLabel old_spielerf = new JLabel(""+p.getTaktik_spielerfahrung());
		old_spielerf.setBounds(428, 462, 46, 14);
		contentPane.add(old_spielerf);
		
		JSpinner spinner_umschaltDef = new JSpinner();
		spinner_umschaltDef.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_umschaltDef.setBounds(500, 333, 50, 20);
		contentPane.add(spinner_umschaltDef);
		
		JSpinner spinner_zug = new JSpinner();
		spinner_zug.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_zug.setBounds(500, 375, 50, 20);
		contentPane.add(spinner_zug);
		
		JSpinner spinner_kreat = new JSpinner();
		spinner_kreat.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_kreat.setBounds(500, 417, 50, 20);
		contentPane.add(spinner_kreat);
		
		JSpinner spinner_spieler = new JSpinner();
		spinner_spieler.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_spieler.setBounds(500, 459, 50, 20);
		contentPane.add(spinner_spieler);
		
		JSlider slider_UmschaltDef = new JSlider();
		slider_UmschaltDef.setBounds(580, 331, 200, 26);
		contentPane.add(slider_UmschaltDef);
		
		JSlider slider_zug = new JSlider();
		slider_zug.setBounds(580, 375, 200, 26);
		contentPane.add(slider_zug);
		
		JSlider slider_kreativ = new JSlider();
		slider_kreativ.setBounds(580, 417, 200, 26);
		contentPane.add(slider_kreativ);
		
		JSlider slider_spieler = new JSlider();
		slider_spieler.setBounds(580, 459, 200, 26);
		contentPane.add(slider_spieler);
		
		JLabel label_Old_Total = new JLabel(""+p.getTaktik_total());
		label_Old_Total.setBounds(428, 504, 46, 14);
		contentPane.add(label_Old_Total);
		
		JButton button = new JButton("Technik");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Technik frame = new Frame_EditPlayer_Technik(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		button.setBounds(12, 390, 105, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Athletik");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Athletik frame = new Frame_EditPlayer_Athletik(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(12, 460, 105, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Pers\u00F6nlichkeit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Persönlichkeit frame = new Frame_EditPlayer_Persönlichkeit(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(12, 495, 105, 23);
		contentPane.add(button_2);
		
		JButton btnTaktik = new JButton("Taktik");
		btnTaktik.setEnabled(false);
		btnTaktik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTaktik.setBounds(12, 425, 105, 23);
		contentPane.add(btnTaktik);
		
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				p.setTaktik_1off(((double) spinner_off1.getValue() * slider_1off.getValue())/100);
				p.setTaktik_1def(((double) spinner_def1.getValue() * slider_1def.getValue())/100);
				p.setTaktik_gruppeOff(((double) spinner_gruppeoff.getValue() * slider_gruppeOff.getValue())/100);
				p.setTaktik_gruppeDef(((double) spinner_gruppeDef.getValue() * slider_gruppeDef.getValue())/100);
				p.setTaktik_freilaufen(((double) spinner_frei.getValue() * slider_frei.getValue())/100);
				p.setTaktik_umschaltOff(((double) spinner_umschalt.getValue() * slider_umschaltOff.getValue())/100);
				p.setTaktik_umschaltDef(((double) spinner_umschaltDef.getValue() * slider_UmschaltDef.getValue())/100);
				p.setTaktik_zugZumTor(((double) spinner_zug.getValue() * slider_zug.getValue())/100);
				p.setTaktik_kreativität(((double) spinner_kreat.getValue() * slider_kreativ.getValue())/100);
				p.setTaktik_spielerfahrung(((double) spinner_spieler.getValue() * slider_spieler.getValue())/100);
				p.setTaktik_total();
								
				label_total.setText(""+p.getTaktik_total());
				
			}
		});

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Frame_Main fm = new Frame_Main();
				fm.setVisible(true);
				fm.updateDB(db);
				dispose();

			}
		});

	}

	public LinkedList<Player> getdb() {
		return db;
	}
	
	

}
