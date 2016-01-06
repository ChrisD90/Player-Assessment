/**
 * 
 */
package model;

import java.util.HashMap;

/**
 * @author Christoph
 *
 */
public class Player {

	/*// alles l�uft �ber double
	String name;
	String prename;

	double total;

	double technik;
	double ballan_mitnahme;
	double passspiel;
	double dribbling;
	double beidf�ssigkeit;
	double kopfball;
	double schusstechnik;*/

	// in HashMap speichern

	HashMap<String, Double> hashmap = new HashMap<String, Double>();

	public Player(String name, String prename, double total, double technik,
			double ballan_mitnahme, double passspiel, double dribbling,
			double beidf�ssigkeit, double kopfball, double schusstechnik) {
		
		hashmap.put("Total", total);
		hashmap.put("Technik", technik);
		hashmap.put("Ballan_Mitnahme", ballan_mitnahme);
		hashmap.put("Passspiel", passspiel);
		hashmap.put("Dribbling", dribbling);
		hashmap.put("Beidf�ssigkeit", beidf�ssigkeit);
		hashmap.put("Kopfball", kopfball);
		hashmap.put("Schusstechnik", schusstechnik);
		
	}
	
	public HashMap returnHashMap() {
		
		return hashmap;
	}

}
