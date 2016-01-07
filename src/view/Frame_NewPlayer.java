package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import model.Player;
import control.Players_DB;

public class Frame_NewPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	Players_DB db;

	/**
	 * Create the frame.
	 */
	public Frame_NewPlayer(Players_DB db) {
		setTitle("New Player");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_NewPlayer.class.getResource("/ressources/Logo1.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(12, 35, 71, 16);
		contentPane.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(12, 77, 71, 16);
		contentPane.add(lblNachname);
		
		textField = new JTextField();
		textField.setBounds(95, 32, 154, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 74, 154, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(335, 100, 97, 25);
		contentPane.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Player ply = new Player(getName(), getPrename());
				db.addPlayer(ply);
				Frame_Main fm = new Frame_Main();
				fm.setVisible(true);
				fm.updateDB(db);
				dispose();
			}
		});
	}
	
	public String getPrename() {
		return textField.getText();
	}
	
	public String getName() {
		return textField_1.getText();
	}
	
	public Players_DB getdb() {
		return db;
	}
}
