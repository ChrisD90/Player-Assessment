package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class Frame_Main extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public Frame_Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_Main.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Frame_Stats fm =new Frame_Stats();
		fm.setVisible(true);
		
	}

}
