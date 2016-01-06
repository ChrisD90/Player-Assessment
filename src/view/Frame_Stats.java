package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Frame_Stats extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Frame_Stats() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame_Stats.class.getResource("/ressources/Logo1.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 907, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(12, 13, 97, 25);
		contentPane.add(btnBack);
		
		JTree tree = new JTree();
		tree.setVisibleRowCount(200);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Player") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					node_1 = new DefaultMutableTreeNode("Technik");
						node_2 = new DefaultMutableTreeNode("Dribbling");
							node_2.add(new DefaultMutableTreeNode("Geschw. mit Ball"));
							node_2.add(new DefaultMutableTreeNode("Gewandheit"));
							node_2.add(new DefaultMutableTreeNode("Ballkontrolle"));
						node_1.add(node_2);
						node_2 = new DefaultMutableTreeNode("Schuss");
							node_2.add(new DefaultMutableTreeNode("Vollspann"));
							node_2.add(new DefaultMutableTreeNode("Innenspann"));
							node_2.add(new DefaultMutableTreeNode("Au\u00DFenspann"));
							node_2.add(new DefaultMutableTreeNode("Innenseitsto\u00DF"));
						node_1.add(node_2);
						node_1.add(new DefaultMutableTreeNode("Passen"));
						node_1.add(new DefaultMutableTreeNode("Spielverst\u00E4ndnis"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Physiologie");
						node_1.add(new DefaultMutableTreeNode("Ausdauer"));
						node_2 = new DefaultMutableTreeNode("Schnelligkeit");
							node_2.add(new DefaultMutableTreeNode("Antritt"));
							node_2.add(new DefaultMutableTreeNode("H\u00F6chstgeschwindigkeit"));
							node_2.add(new DefaultMutableTreeNode("Gewandheit"));
						node_1.add(node_2);
						node_1.add(new DefaultMutableTreeNode("Anthropometrie"));
					add(node_1);
				}
			}
		));
		tree.setBounds(538, 81, 292, 490);
		contentPane.add(tree);
	}
}
