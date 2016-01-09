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

public class Frame_Main extends JFrame implements ListSelectionListener {

	private JPanel contentPane;

	/**
	 * Players DB wird initialisiert
	 */
	LinkedList<Player> db = new LinkedList<Player>();
	private JButton btnLoadDb;
	private JButton btnPrintSelectedPlayer;
	private JButton btnDeleteDb;
	private JButton btnNewPlayer;
	JComboBox<String> comboBox;
	private JLabel lblTechnik;
	private JLabel lbl_technik;
	private JLabel lblTechnik_1;
	private JLabel lbltech;
	private JLabel lblTaktik;
	private JLabel lblAthletik;
	private JLabel lblPersnlichkeit;
	private JLabel lbltac;
	private JLabel lblat;
	private JLabel lblper;

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

		JButton btnEditPlayer = new JButton("Edit Player");
		btnEditPlayer.setBounds(660, 515, 110, 25);
		contentPane.add(btnEditPlayer);

		JButton btnPrintDb = new JButton("Print DB");
		btnPrintDb.setBounds(12, 515, 97, 25);
		contentPane.add(btnPrintDb);

		btnLoadDb = new JButton("Load DB");
		btnLoadDb.setBounds(12, 26, 97, 25);
		contentPane.add(btnLoadDb);

		btnPrintSelectedPlayer = new JButton("Show Player");
		btnPrintSelectedPlayer.setBounds(123, 515, 149, 25);
		contentPane.add(btnPrintSelectedPlayer);

		btnDeleteDb = new JButton("Delete DB");
		btnDeleteDb.setBounds(178, 26, 97, 25);
		contentPane.add(btnDeleteDb);

		btnNewPlayer = new JButton("New Player");
		btnNewPlayer.setBounds(660, 481, 110, 23);
		contentPane.add(btnNewPlayer);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(12, 73, 260, 25);
		contentPane.add(comboBox);

		lblTechnik_1 = new JLabel("Technik");
		lblTechnik_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTechnik_1.setBounds(391, 71, 97, 32);
		contentPane.add(lblTechnik_1);

		lbltech = new JLabel("-");
		lbltech.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltech.setHorizontalAlignment(SwingConstants.CENTER);
		lbltech.setBounds(524, 69, 97, 32);
		contentPane.add(lbltech);

		lblTaktik = new JLabel("Taktik");
		lblTaktik.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTaktik.setBounds(391, 151, 97, 32);
		contentPane.add(lblTaktik);

		lblAthletik = new JLabel("Athletik");
		lblAthletik.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAthletik.setBounds(391, 231, 97, 32);
		contentPane.add(lblAthletik);

		lblPersnlichkeit = new JLabel("Pers\u00F6nlichkeit");
		lblPersnlichkeit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPersnlichkeit.setBounds(391, 311, 161, 32);
		contentPane.add(lblPersnlichkeit);

		lbltac = new JLabel("-");
		lbltac.setHorizontalAlignment(SwingConstants.CENTER);
		lbltac.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltac.setBounds(524, 151, 97, 32);
		contentPane.add(lbltac);

		lblat = new JLabel("-");
		lblat.setHorizontalAlignment(SwingConstants.CENTER);
		lblat.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblat.setBounds(524, 231, 97, 32);
		contentPane.add(lblat);

		lblper = new JLabel("-");
		lblper.setHorizontalAlignment(SwingConstants.CENTER);
		lblper.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblper.setBounds(524, 311, 97, 32);
		contentPane.add(lblper);

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

		btnPrintSelectedPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x = comboBox.getSelectedIndex();
				lbltech.setText("" + db.get(x).getTechnik_total());
				lbltac.setText("" + db.get(x).getTaktik_total());
				lblat.setText("" + db.get(x).getAthletik_total());
				lblper.setText("" + db.get(x).getPersönlichkeit_total());

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
							// TODO WINDOW
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

		// Zuvor alle mit dem File assoziierten Streams schließen...

		if (file.exists()) {

			try {
				db = readDBfromFile();
			} catch (Exception e) {
				e.printStackTrace();
			}

			comboBox.removeAllItems();
			for (int i = 0; i < db.size(); i++) {
				Player p = db.get(i);
				comboBox.addItem(p.getID());
			}

			Dialog_DBLoaded dialog = new Dialog_DBLoaded();
			dialog.setVisible(true);
		} else {

			// TODO WINDOW
			System.out.println("NO DATABSE!");
		}
	}

	/**
	 * reads DB from File
	 * 
	 * @return
	 */
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
