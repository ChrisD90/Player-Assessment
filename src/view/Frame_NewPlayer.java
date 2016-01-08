package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import model.Player;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;

public class Frame_NewPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	LinkedList<Player> db;
	private JTextField textField_2;

	double[] tech = new double[7];
	int[] slider_tech = new int[7];

	/**
	 * Create the frame.
	 */
	public Frame_NewPlayer(LinkedList<Player> db) {
		setTitle("New Player");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Frame_NewPlayer.class.getResource("/ressources/Logo1.png")));
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

		textField = new JTextField();
		textField.setBounds(95, 80, 154, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(95, 122, 154, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setBounds(677, 525, 97, 25);
		contentPane.add(btnOk);

		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum");
		lblGeburtsdatum.setBounds(10, 167, 83, 14);
		contentPane.add(lblGeburtsdatum);

		textField_2 = new JTextField();
		textField_2.setBounds(95, 164, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

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
				.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		ballanna_mitnahme.setBounds(428, 81, 50, 20);
		contentPane.add(ballanna_mitnahme);

		JSlider slider_ball = new JSlider();
		slider_ball.setBounds(517, 76, 200, 26);
		contentPane.add(slider_ball);

		JSpinner passspiel = new JSpinner();
		passspiel.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		passspiel.setBounds(428, 123, 50, 20);
		contentPane.add(passspiel);

		JSpinner dribbling = new JSpinner();
		dribbling.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		dribbling.setBounds(428, 164, 50, 20);
		contentPane.add(dribbling);

		JSpinner beidfuss = new JSpinner();
		beidfuss.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		beidfuss.setBounds(428, 207, 50, 20);
		contentPane.add(beidfuss);

		JSpinner schuss = new JSpinner();
		schuss.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		schuss.setBounds(428, 294, 50, 20);
		contentPane.add(schuss);

		JSlider slider_pass = new JSlider();
		slider_pass.setBounds(517, 122, 200, 26);
		contentPane.add(slider_pass);

		JSlider slider_dribbling = new JSlider();
		slider_dribbling.setBounds(517, 164, 200, 26);
		contentPane.add(slider_dribbling);

		JSlider slider_beidfuss = new JSlider();
		slider_beidfuss.setBounds(517, 207, 200, 26);
		contentPane.add(slider_beidfuss);

		JSlider slider_schuss = new JSlider();
		slider_schuss.setBounds(517, 294, 200, 26);
		contentPane.add(slider_schuss);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setBounds(295, 352, 46, 14);
		contentPane.add(lblTotal);
		
		JLabel label_total = new JLabel("---");
		label_total.setHorizontalAlignment(SwingConstants.CENTER);
		label_total.setBounds(432, 352, 46, 14);
		contentPane.add(label_total);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 526, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblKopfball = new JLabel("Kopfball");
		lblKopfball.setBounds(295, 252, 123, 14);
		contentPane.add(lblKopfball);
		
		JSpinner kopfball = new JSpinner();
		kopfball.setModel(new SpinnerNumberModel(0.0, null, 10.0, 1.0));
		kopfball.setBounds(428, 249, 50, 20);
		contentPane.add(kopfball);
		
		JSlider slider_kopfball = new JSlider();
		slider_kopfball.setBounds(517, 249, 200, 26);
		contentPane.add(slider_kopfball);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Main fm = new Frame_Main();
				fm.setVisible(true);
				fm.updateDB(db);
				dispose();
				
			}
		});
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Player p = new Player(getName(), getPrename());
				
				p.setTechnik_Ballan(((double) ballanna_mitnahme.getValue() * slider_ball.getValue())/100);
				p.setTechnik_Pass(((double) passspiel.getValue() * slider_pass.getValue())/100);
				p.setTechnik_Dribbling(((double) dribbling.getValue() * slider_dribbling.getValue())/100);
				p.setTechnik_Beidf(((double) beidfuss.getValue() * slider_beidfuss.getValue())/100);
				p.setTechnik_Kopfball(((double) kopfball.getValue() * slider_kopfball.getValue())/100);
				p.setTechnik_Schuss(((double) schuss.getValue() * slider_schuss.getValue())/100);
				p.setTechnik_total();
				
				System.out.println(p.getTechnik_Ballan());
				db.add(p);
				
				label_total.setText(""+p.getTechnik_total());
				
			}
		});
	}

	public String getPrename() {
		return textField.getText();
	}

	public String getName() {
		return textField_1.getText();
	}

	public LinkedList<Player> getdb() {
		return db;
	}
}
