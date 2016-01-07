package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import control.Players_DB;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Frame_Opening extends JFrame {

	/**
	 * Create the dialog.
	 */
	public Frame_Opening() {
				
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_Opening.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 349);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 267, 562, 35);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("Start");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Frame_Main ws = new Frame_Main();
						ws.setVisible(true);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JLabel lblPic = new JLabel("pic");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon(Frame_Opening.class.getResource("/ressources/Logo5.png")));
		lblPic.setBounds(0, -47, 588, 301);
		getContentPane().add(lblPic);
	}
}
