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

public class Frame_EditPlayer_Technik extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -942683998204613511L;

	private JPanel contentPane;

	LinkedList<Player> db;
	Player p;

	double[] tech = new double[7];
	int[] slider_tech = new int[7];

	/**
	 * Create the frame.
	 */
	public Frame_EditPlayer_Technik(LinkedList<Player> db, Player p) {
		
		this.p = p;
		
		setResizable(false);
		setTitle("Edit Player");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_EditPlayer_Technik.class.getResource("/ressources/Logo1.png")));
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

		JLabel lblTechnik = new JLabel("Technik");
		lblTechnik.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTechnik.setBounds(295, 30, 73, 22);
		contentPane.add(lblTechnik);

		JLabel lblBallanUndMitnahme = new JLabel("Ballan- und Mitnahme");
		lblBallanUndMitnahme.setBounds(295, 84, 123, 14);
		contentPane.add(lblBallanUndMitnahme);

		JLabel lblPassspiel = new JLabel("Passspiel");
		lblPassspiel.setBounds(295, 126, 123, 14);
		contentPane.add(lblPassspiel);

		JLabel lblDribbling = new JLabel("Dribbling");
		lblDribbling.setBounds(295, 168, 123, 14);
		contentPane.add(lblDribbling);

		JLabel lblBeidfigkeit = new JLabel("Beidf\u00FC\u00DFigkeit");
		lblBeidfigkeit.setBounds(295, 210, 123, 14);
		contentPane.add(lblBeidfigkeit);

		JLabel lblSchusstechnik = new JLabel("Schusstechnik");
		lblSchusstechnik.setBounds(295, 294, 123, 14);
		contentPane.add(lblSchusstechnik);

		JSpinner ballanna_mitnahme = new JSpinner();
		ballanna_mitnahme
				.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		ballanna_mitnahme.setBounds(500, 81, 50, 20);
		contentPane.add(ballanna_mitnahme);

		JSlider slider_ball = new JSlider();
		slider_ball.setPaintLabels(true);
		slider_ball.setBounds(580, 76, 200, 26);
		contentPane.add(slider_ball);

		JSpinner passspiel = new JSpinner();
		passspiel.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		passspiel.setBounds(500, 123, 50, 20);
		contentPane.add(passspiel);

		JSpinner dribbling = new JSpinner();
		dribbling.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		dribbling.setBounds(500, 164, 50, 20);
		contentPane.add(dribbling);

		JSpinner beidfuss = new JSpinner();
		beidfuss.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		beidfuss.setBounds(500, 207, 50, 20);
		contentPane.add(beidfuss);

		JSpinner schuss = new JSpinner();
		schuss.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		schuss.setBounds(500, 294, 50, 20);
		contentPane.add(schuss);

		JSlider slider_pass = new JSlider();
		slider_pass.setBounds(580, 122, 200, 26);
		contentPane.add(slider_pass);

		JSlider slider_dribbling = new JSlider();
		slider_dribbling.setBounds(580, 164, 200, 26);
		contentPane.add(slider_dribbling);

		JSlider slider_beidfuss = new JSlider();
		slider_beidfuss.setBounds(580, 207, 200, 26);
		contentPane.add(slider_beidfuss);

		JSlider slider_schuss = new JSlider();
		slider_schuss.setBounds(580, 294, 200, 26);
		contentPane.add(slider_schuss);

		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setBounds(295, 352, 46, 14);
		contentPane.add(lblTotal);

		JLabel label_total = new JLabel("---");
		label_total.setHorizontalAlignment(SwingConstants.CENTER);
		label_total.setBounds(500, 352, 46, 14);
		contentPane.add(label_total);

		JButton btnBack = new JButton("Start");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(12, 537, 107, 23);
		contentPane.add(btnBack);

		JLabel lblKopfball = new JLabel("Kopfball");
		lblKopfball.setBounds(295, 252, 123, 14);
		contentPane.add(lblKopfball);

		JSpinner kopfball = new JSpinner();
		kopfball.setModel(new SpinnerNumberModel(0, 0.0, 10.0, 1.0));
		kopfball.setBounds(500, 249, 50, 20);
		contentPane.add(kopfball);

		JSlider slider_kopfball = new JSlider();
		slider_kopfball.setBounds(580, 249, 200, 26);
		contentPane.add(slider_kopfball);
		
		JLabel label_geb = new JLabel(p.getBirthday());
		label_geb.setBounds(103, 167, 128, 14);
		contentPane.add(label_geb);
		
		JLabel label_name = new JLabel(p.getName());
		label_name.setBounds(103, 126, 128, 14);
		contentPane.add(label_name);
		
		JLabel label_vorname = new JLabel(p.getPrename());
		label_vorname.setBounds(103, 84, 128, 14);
		contentPane.add(label_vorname);
		
		JLabel old_ball = new JLabel(""+p.getTechnik_Ballan());
		old_ball.setBounds(428, 84, 46, 14);
		contentPane.add(old_ball);
		
		JLabel old_pass = new JLabel(""+p.getTechnik_Pass());
		old_pass.setBounds(428, 126, 46, 14);
		contentPane.add(old_pass);
		
		JLabel old_dribbling = new JLabel(""+p.getTechnik_Dribbling());
		old_dribbling.setBounds(428, 167, 46, 14);
		contentPane.add(old_dribbling);
		
		JLabel old_beid = new JLabel(""+p.getTechnik_Beidf());
		old_beid.setBounds(428, 210, 46, 14);
		contentPane.add(old_beid);
		
		JLabel old_kopf = new JLabel(""+p.getTechnik_Kopfball());
		old_kopf.setBounds(428, 252, 46, 14);
		contentPane.add(old_kopf);
		
		JLabel old_schuss = new JLabel(""+p.getTechnik_Schuss());
		old_schuss.setBounds(428, 294, 46, 14);
		contentPane.add(old_schuss);
		
		JButton btnTaktik = new JButton("Taktik");
		btnTaktik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Taktik frame = new Frame_EditPlayer_Taktik(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		
		btnTaktik.setBounds(12, 423, 105, 23);
		contentPane.add(btnTaktik);
		
		JButton btnAthletik = new JButton("Athletik");
		btnAthletik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Athletik frame = new Frame_EditPlayer_Athletik(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		btnAthletik.setBounds(12, 458, 105, 23);
		contentPane.add(btnAthletik);
		
		JButton btnPersnlichkeit = new JButton("Pers\u00F6nlichkeit");
		btnPersnlichkeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_EditPlayer_Persönlichkeit frame = new Frame_EditPlayer_Persönlichkeit(db, p);
				frame.setVisible(true);
				dispose();
			}
		});
		btnPersnlichkeit.setBounds(12, 493, 105, 23);
		contentPane.add(btnPersnlichkeit);
		
		JButton btnTechnik = new JButton("Technik");
		btnTechnik.setEnabled(false);
		btnTechnik.setBounds(12, 388, 105, 23);
		contentPane.add(btnTechnik);
		
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				p.setTechnik_Ballan(((double) ballanna_mitnahme.getValue() * slider_ball.getValue())/100);
				p.setTechnik_Pass(((double) passspiel.getValue() * slider_pass.getValue())/100);
				p.setTechnik_Dribbling(((double) dribbling.getValue() * slider_dribbling.getValue())/100);
				p.setTechnik_Beidf(((double) beidfuss.getValue() * slider_beidfuss.getValue())/100);
				p.setTechnik_Kopfball(((double) kopfball.getValue() * slider_kopfball.getValue())/100);
				p.setTechnik_Schuss(((double) schuss.getValue() * slider_schuss.getValue())/100);
				p.setTechnik_total();
								
				label_total.setText(""+p.getTechnik_total());
				
				
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
