package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import control.Players_DB;

import javax.swing.JComboBox;
import javax.swing.JList;

public class Frame_Main extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Players DB wird initialisiert
	 */
	Players_DB db = new Players_DB();


	/**
	 * Create the frame.
	 */
	public Frame_Main() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_Main.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewPlayer = new JButton("New Player");
		btnNewPlayer.setBounds(660, 515, 110, 25);
		contentPane.add(btnNewPlayer);
		
		JList<String> list = new JList<String>();
		list.setBounds(44, 294, 1, 1);
		contentPane.add(list);
		
		btnNewPlayer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame_NewPlayer fnp = new Frame_NewPlayer(db);
				fnp.setVisible(true);
				dispose();
			}
		});
		
	}
}

