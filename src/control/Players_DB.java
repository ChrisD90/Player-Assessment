package control;

import java.util.LinkedList;

import model.Player;

public class Players_DB {

	LinkedList <Player> players = new LinkedList <Player>();
	
	public void addPlayer(Player player) {
		players.add(player);
	}
}
