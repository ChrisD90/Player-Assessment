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

		JLabel lblSchusstechnik = new JLabel("positionsspezifische Taktik");
		lblSchusstechnik.setBounds(295, 294, 123, 14);
		contentPane.add(lblSchusstechnik);

		JSpinner spinner_off1 = new JSpinner();
		spinner_off1
				.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_off1.setBounds(500, 81, 50, 20);
		contentPane.add(spinner_off1);

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

		JLabel lblKopfball = new JLabel("Mannschaftstaktik");
		lblKopfball.setBounds(295, 252, 123, 14);
		contentPane.add(lblKopfball);

		JSpinner spinner_frei = new JSpinner();
		spinner_frei.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		spinner_frei.setBounds(500, 249, 50, 20);
		contentPane.add(spinner_frei);
		
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
		
		JLabel lblUmschaltenDefensiv = new JLabel("Umschalterverhalten");
		lblUmschaltenDefensiv.setBounds(295, 336, 123, 14);
		contentPane.add(lblUmschaltenDefensiv);
		
		JLabel lblZugZumTor = new JLabel("taktische Kognition");
		lblZugZumTor.setBounds(295, 378, 123, 14);
		contentPane.add(lblZugZumTor);
		
		JLabel lblKreativitt = new JLabel("taktische Subtitlit\u00E4t");
		lblKreativitt.setBounds(295, 420, 123, 14);
		contentPane.add(lblKreativitt);
		
		JLabel old_umDef = new JLabel(""+p.getTaktik_umschaltDef());
		old_umDef.setBounds(428, 336, 46, 14);
		contentPane.add(old_umDef);
		
		JLabel old_zug = new JLabel(""+p.getTaktik_zugZumTor());
		old_zug.setBounds(428, 378, 46, 14);
		contentPane.add(old_zug);
		
		JLabel old_kreat = new JLabel(""+p.getTaktik_kreativität());
		old_kreat.setBounds(428, 420, 46, 14);
		contentPane.add(old_kreat);
		
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
		
		JLabel label = new JLabel("Gewichtung");
		label.setBounds(626, 49, 107, 16);
		contentPane.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(626, 78, 71, 22);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(626, 120, 71, 22);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(626, 161, 71, 22);
		contentPane.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(626, 204, 71, 22);
		contentPane.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(626, 246, 71, 22);
		contentPane.add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(626, 292, 71, 22);
		contentPane.add(spinner_5);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(626, 332, 71, 22);
		contentPane.add(spinner_6);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(626, 374, 71, 22);
		contentPane.add(spinner_7);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(626, 416, 71, 22);
		contentPane.add(spinner_8);
		
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double a = (double) spinner.getValue()/100;
				double b = (double) spinner_1.getValue()/100;
				double c = (double) spinner_2.getValue()/100;
				double d = (double) spinner_3.getValue()/100;
				double e1 = (double) spinner_4.getValue()/100;
				double f = (double) spinner_5.getValue()/100;
				double g = (double) spinner_6.getValue()/100;
				double h = (double) spinner_7.getValue()/100;
				double i = (double) spinner_8.getValue()/100;
				
				
				double sum = a+b+c+d+e1+f+g+h+i;
				
		
				if(sum == 1) {
				
				p.setTaktik_1off((double) spinner_off1.getValue() * a);
				p.setTaktik_1def((double) spinner_def1.getValue() * b);
				p.setTaktik_gruppeOff((double) spinner_gruppeoff.getValue() * c);
				p.setTaktik_gruppeDef((double) spinner_gruppeDef.getValue() * d);
				p.setTaktik_freilaufen((double) spinner_frei.getValue() * e1);
				p.setTaktik_umschaltOff((double) spinner_umschalt.getValue() * f);
				p.setTaktik_umschaltDef((double) spinner_umschaltDef.getValue() * g);
				p.setTaktik_zugZumTor((double) spinner_zug.getValue() * h);
				p.setTaktik_kreativität((double) spinner_kreat.getValue() * i);
				
				p.setTaktik_total();
								
				label_total.setText(""+p.getTaktik_total());
				}
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
