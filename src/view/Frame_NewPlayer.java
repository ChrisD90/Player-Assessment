package view;

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
import java.awt.Font;


public class Frame_NewPlayer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	LinkedList<Player> db;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public Frame_NewPlayer(LinkedList<Player> db) {
		setResizable(false);
		setTitle("New Player");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Frame_NewPlayer.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 297, 304);
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

		JButton btnOk = new JButton("SAVE");
		btnOk.setBounds(152, 224, 97, 25);
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

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 225, 107, 23);
		contentPane.add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_Main fm = new Frame_Main();
				fm.updateDB(db);
				fm.setVisible(true);
				dispose();

			}
		});

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!textField.getText().equals("")
						&& !textField_1.getText().equals("")
						&& !textField_2.getText().equals("")) {

					Player p = new Player(getName(), getPrename(),
							getBirthday());
					
					db.add(p);
					
					Frame_Main fm = new Frame_Main();
					fm.setVisible(true);
					fm.updateDB(db);
					dispose();
				} else {
					System.out.println("PLEASE ENTER A CORRECT NAME!!");
				}
			}

		});
	}

	public String getPrename() {
		return textField.getText();
	}

	public String getName() {
		return textField_1.getText();
	}

	public String getBirthday() {
		return textField_2.getText();
	}

	public LinkedList<Player> getdb() {
		return db;
	}

}
