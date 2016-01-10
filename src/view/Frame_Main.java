package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;

import model.Player;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JSeparator;

public class Frame_Main extends JFrame implements ListSelectionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Players DB wird initialisiert
	 */
	LinkedList<Player> db = new LinkedList<Player>();
	private JButton btnLoadDb;
	private JButton buttonSpieler1anzeigen;
	private JButton btnDeleteDb;
	private JButton btnNewPlayer;
	JComboBox<String> comboBox;
	private JLabel lblTechnik_1;
	private JLabel lbltech;
	private JLabel lblTaktik;
	private JLabel lblAthletik;
	private JLabel lblPersnlichkeit;
	private JLabel lbltac;
	private JLabel lblat;
	private JLabel lblper;

	private JLabel labeltot1;

	private JComboBox<String> comboBox_1;

	/**
	 * Create the frame.
	 */
	public Frame_Main() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Frame_Main.class.getResource("/ressources/Logo1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEditPlayer = new JButton("Bearbeiten");
		btnEditPlayer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEditPlayer.setBounds(177, 222, 97, 25);
		contentPane.add(btnEditPlayer);

		JButton btnPrintDb = new JButton("Print DB");
		btnPrintDb.setBounds(677, 11, 97, 25);
		contentPane.add(btnPrintDb);

		btnLoadDb = new JButton("Load DB");
		btnLoadDb.setBounds(12, 11, 97, 25);
		contentPane.add(btnLoadDb);

		buttonSpieler1anzeigen = new JButton("Spieler anzeigen");
		buttonSpieler1anzeigen.setFont(new Font("Tahoma", Font.PLAIN, 9));
		buttonSpieler1anzeigen.setBounds(10, 223, 110, 25);
		contentPane.add(buttonSpieler1anzeigen);

		btnDeleteDb = new JButton("Delete DB");
		btnDeleteDb.setBounds(177, 11, 97, 25);
		contentPane.add(btnDeleteDb);

		btnNewPlayer = new JButton("Neuer Spieler");
		btnNewPlayer.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewPlayer.setBounds(177, 188, 97, 23);
		contentPane.add(btnNewPlayer);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(12, 95, 260, 25);
		contentPane.add(comboBox);

		lblTechnik_1 = new JLabel("Technik");
		lblTechnik_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTechnik_1.setBounds(345, 87, 97, 32);
		contentPane.add(lblTechnik_1);

		lbltech = new JLabel("-");
		lbltech.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltech.setHorizontalAlignment(SwingConstants.CENTER);
		lbltech.setBounds(478, 85, 97, 32);
		contentPane.add(lbltech);

		lblTaktik = new JLabel("Taktik");
		lblTaktik.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTaktik.setBounds(345, 129, 97, 32);
		contentPane.add(lblTaktik);

		lblAthletik = new JLabel("Athletik");
		lblAthletik.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAthletik.setBounds(345, 172, 97, 32);
		contentPane.add(lblAthletik);

		lblPersnlichkeit = new JLabel("Pers\u00F6nlichkeit");
		lblPersnlichkeit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersnlichkeit.setBounds(345, 215, 161, 32);
		contentPane.add(lblPersnlichkeit);

		lbltac = new JLabel("-");
		lbltac.setHorizontalAlignment(SwingConstants.CENTER);
		lbltac.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltac.setBounds(478, 129, 97, 32);
		contentPane.add(lbltac);

		lblat = new JLabel("-");
		lblat.setHorizontalAlignment(SwingConstants.CENTER);
		lblat.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblat.setBounds(478, 172, 97, 32);
		contentPane.add(lblat);

		lblper = new JLabel("-");
		lblper.setHorizontalAlignment(SwingConstants.CENTER);
		lblper.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblper.setBounds(478, 215, 97, 32);
		contentPane.add(lblper);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(12, 360, 260, 20);
		contentPane.add(comboBox_1);

		JLabel lblSpielerWhlen = new JLabel("Spieler w\u00E4hlen:");
		lblSpielerWhlen.setBounds(12, 70, 260, 14);
		contentPane.add(lblSpielerWhlen);

		JLabel lblSpielerFrVergleich = new JLabel(
				"Spieler f\u00FCr Vergleich w\u00E4hlen:");
		lblSpielerFrVergleich.setBounds(10, 335, 260, 14);
		contentPane.add(lblSpielerFrVergleich);

		JLabel labelTechnik2 = new JLabel("Technik");
		labelTechnik2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelTechnik2.setBounds(345, 362, 97, 32);
		contentPane.add(labelTechnik2);

		JLabel label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(478, 360, 97, 32);
		contentPane.add(label_1);

		JLabel labelTaktik2 = new JLabel("Taktik");
		labelTaktik2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelTaktik2.setBounds(345, 404, 97, 32);
		contentPane.add(labelTaktik2);

		JLabel label_3 = new JLabel("-");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_3.setBounds(478, 404, 97, 32);
		contentPane.add(label_3);

		JLabel labelAthletik2 = new JLabel("Athletik");
		labelAthletik2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelAthletik2.setBounds(345, 447, 97, 32);
		contentPane.add(labelAthletik2);

		JLabel label_5 = new JLabel("-");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_5.setBounds(478, 447, 97, 32);
		contentPane.add(label_5);

		JLabel labelPers2 = new JLabel("Pers\u00F6nlichkeit");
		labelPers2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelPers2.setBounds(345, 490, 161, 32);
		contentPane.add(labelPers2);

		JLabel label_7 = new JLabel("-");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label_7.setBounds(478, 490, 97, 32);
		contentPane.add(label_7);

		JButton buttonSpieler2anzeigen = new JButton("Spieler anzeigen");

		buttonSpieler2anzeigen.setFont(new Font("Tahoma", Font.PLAIN, 9));
		buttonSpieler2anzeigen.setBounds(10, 497, 149, 25);
		contentPane.add(buttonSpieler2anzeigen);

		JLabel lblTotal1 = new JLabel("TOTAL:");
		lblTotal1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotal1.setBounds(610, 215, 76, 32);
		contentPane.add(lblTotal1);

		JLabel labelTotal2 = new JLabel("TOTAL:");
		labelTotal2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		labelTotal2.setBounds(610, 490, 76, 32);
		contentPane.add(labelTotal2);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 45, 782, 5);
		contentPane.add(separator);

		JLabel lblSpieler1 = new JLabel("Spieler");
		lblSpieler1.setBounds(344, 70, 430, 14);
		contentPane.add(lblSpieler1);

		JLabel labelSpieler2 = new JLabel("Spieler");
		labelSpieler2.setBounds(345, 335, 430, 14);
		contentPane.add(labelSpieler2);

		labeltot1 = new JLabel("-");
		labeltot1.setHorizontalAlignment(SwingConstants.CENTER);
		labeltot1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC,
				20));
		labeltot1.setBounds(687, 215, 97, 32);
		contentPane.add(labeltot1);

		JLabel label = new JLabel("-");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		label.setBounds(677, 490, 97, 32);
		contentPane.add(label);

		btnNewPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame_NewPlayer fnp = new Frame_NewPlayer(db);
				fnp.setVisible(true);
				dispose();
			}
		});
		btnLoadDb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadDB();

			}
		});

		btnPrintDb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dbToConsole();

			}
		});

		btnEditPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				editPlayer();

			}
		});

		buttonSpieler1anzeigen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x = comboBox.getSelectedIndex();
				lbltech.setText("" + db.get(x).getTechnik_total());
				lbltac.setText("" + db.get(x).getTaktik_total());
				lblat.setText("" + db.get(x).getAthletik_total());
				lblper.setText("" + db.get(x).getPersönlichkeit_total());
				db.get(x).setTotal();
				labeltot1.setText("" + db.get(x).getTotal_Player());
				lblSpieler1.setText(db.get(x).getID());

			}
		});

		btnDeleteDb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int res = JOptionPane.showConfirmDialog(null,
						"Alle Spieler wirklich löschen?", "",
						JOptionPane.YES_NO_OPTION);
				switch (res) {
				case JOptionPane.YES_OPTION:
					try {
						File file = new File("playersDB");
						if (file.exists()) {
							file.delete();
							System.out.println("File deleted");
							Frame_Main frame = new Frame_Main();
							frame.setVisible(true);
							dispose();
						} else {
							System.out.println("NO DATABSE!");
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Datenbank gelöscht!");
					break;
				case JOptionPane.NO_OPTION:
					System.out.println("Löschen abgebrochen!");
					JOptionPane.showMessageDialog(null, "Löschen abgebrochen!");
					break;
				}

			}
		});

		buttonSpieler2anzeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x = comboBox_1.getSelectedIndex();
				label_1.setText("" + db.get(x).getTechnik_total());
				label_3.setText("" + db.get(x).getTaktik_total());
				label_5.setText("" + db.get(x).getAthletik_total());
				label_7.setText("" + db.get(x).getPersönlichkeit_total());
				db.get(x).setTotal();
				label.setText("" + db.get(x).getTotal_Player());
				labelSpieler2.setText(db.get(x).getID());
			}
		});

		loadDB();

	}

	/**
	 * updates DB after new player added
	 */
	public void updateDB(LinkedList<Player> db) {
		this.db = db;
		writeDBtoFile();
		loadDB();
	}

	public void dbToConsole() {

		int i = 0;
		while (i < db.size()) {
			Player p = db.get(i);

			System.out.println(p.getID());

			i++;
		}

	}

	/**
	 * loads the latest DB into the program from the file "playersDB"
	 */
	public void loadDB() {
		File file = new File("playersDB");

		if (file.exists()) {

			try {
				db = readDBfromFile();
			} catch (Exception e) {
				e.printStackTrace();
			}

			comboBox.removeAllItems();
			comboBox_1.removeAllItems();

			for (int i = 0; i < db.size(); i++) {
				Player p = db.get(i);
				comboBox.addItem(p.getID());
				comboBox_1.addItem(p.getID());
			}
			// JOptionPane.showMessageDialog(null, "Datenbank geladen!");

		} else {
			JOptionPane.showMessageDialog(null, "Keine Datenbank vorhanden!");
			System.out.println("NO DATABSE!");
		}
	}

	/**
	 * reads DB from File
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public LinkedList<Player> readDBfromFile() {

		LinkedList<Player> load = new LinkedList<Player>();

		try {
			FileInputStream fis = new FileInputStream("playersDB");
			ObjectInputStream ois = new ObjectInputStream(fis);
			load = (LinkedList<Player>) ois.readObject();
			ois.close();
			fis.close();

		} catch (IOException ioe) {
			// Dialog_NoFile dnf = new Dialog_NoFile();
			// dnf.setVisible(true);
			ioe.printStackTrace();

		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();

		}

		return load;
	}

	/**
	 * writes the DB to a file
	 */
	public void writeDBtoFile() {
		try {
			FileOutputStream fos = new FileOutputStream("playersDB");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(db);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * adds a player to the DB and updates the file happens in "Frame_NewPlayer"
	 */
	public void editPlayer() {
		int x = comboBox.getSelectedIndex();
		Player p = db.get(x);

		Frame_EditPlayer_Technik fnp = new Frame_EditPlayer_Technik(db, p);
		fnp.setVisible(true);
		dispose();
	}

	/**
	 * prints selected Player at Position i
	 * 
	 * @param i
	 */
	public void printPlayer(int i) {

		Player p = db.get(i);
		p.setTechnik_Dribbling(i + 1);
		System.out.println(p.getTechnik_Dribbling());
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// Auto-generated method stub

	}
}
