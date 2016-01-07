package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import model.Player;

import javax.swing.JTextArea;

public class Frame_Main extends JFrame implements ListSelectionListener {

	private JPanel contentPane;

	/**
	 * Players DB wird initialisiert
	 */
	LinkedList<Player> db = new LinkedList<Player>();
	private JList<String> list;
	private JButton btnLoadDb;
	private JButton btnPrintSelectedPlayer;

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
		
		

		JButton btnNewPlayer = new JButton("New Player");
		btnNewPlayer.setBounds(660, 515, 110, 25);
		contentPane.add(btnNewPlayer);

		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(list);
		list.setBounds(12, 65, 260, 434);
		contentPane.add(list);

		JButton btnPrintDb = new JButton("Print DB");
		btnPrintDb.setBounds(12, 515, 97, 25);
		contentPane.add(btnPrintDb);

		btnLoadDb = new JButton("Load DB");
		btnLoadDb.setBounds(12, 26, 97, 25);
		contentPane.add(btnLoadDb);
		
		btnPrintSelectedPlayer = new JButton("Print selected Player");
		btnPrintSelectedPlayer.setBounds(123, 515, 149, 25);
		contentPane.add(btnPrintSelectedPlayer);
		btnLoadDb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadDB();
				Dialog_DBLoaded dialog = new Dialog_DBLoaded();
				dialog.setVisible(true);

			}
		});

		btnPrintDb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dbToConsole();

			}
		});

		btnNewPlayer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addPlayer();
				
			}
		});
		
		btnPrintSelectedPlayer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while(i<db.size()) {
					printPlayer(i);	
					i++;
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
	}

	public void dbToConsole() {

		int i = 0;
		while (i < db.size()) {
			Player p = db.get(i);
			System.out.println(p.getName() + ", " + p.getPrename() + " - "
					+ p.getTotal());

			i++;
		}

	}

	/**
	 * loads the latest DB into the program from the file "playersDB"
	 */
	public void loadDB() {

		try {
			db = readDBfromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * reads DB from File
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
	 * adds a player to the DB and updates the file
	 * happens in "Frame_NewPlayer"
	 */
	public void addPlayer() {
		Frame_NewPlayer fnp = new Frame_NewPlayer(db);
		fnp.setVisible(true);
		dispose();
	}
	
	/**
	 * prints selected Player at Position i
	 * @param i
	 */
	public void printPlayer(int i) {
		int x = i;
		Player p = db.get(i);
		p.setDribbling(i+1);
		System.out.println(p.getDribbling());
	}
	
	/**
	 * TODO: liste Füllen
	 * spieler über Namen ansteuern
	 * ID einführen?! z.B.: Vorname+Nachname+Geburtsdatum ohne Punkte
	 */
	public void fillList() {
		
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
