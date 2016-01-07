package control;

import java.util.LinkedList;

import model.Player;

public class Players_DB {

	LinkedList <Player> players;
	
	public Players_DB() {
		players = new LinkedList <Player>();
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public int getSize() {
		return players.size();
	}
	
	public String getName(int i) {
		
		Player player = players.get(i);
		return player.getName();
	}
}
