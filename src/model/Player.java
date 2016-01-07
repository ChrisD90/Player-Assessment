/**
 * 
 */
package model;


/**
 * @author Christoph
 *
 */
public class Player{


	double total;

	double technik;
	double ballan_mitnahme;
	double passspiel;
	double dribbling;
	double beidfüssigkeit;
	double kopfball;
	double schusstechnik;

	String name;
	String prename;

	public Player(String name, String prename) {
		
		this.name = name;
		this.prename = name;
		
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTechnik() {
		return technik;
	}

	public void setTechnik(double technik) {
		this.technik = technik;
	}

	public double getBallan_mitnahme() {
		return ballan_mitnahme;
	}

	public void setBallan_mitnahme(double ballan_mitnahme) {
		this.ballan_mitnahme = ballan_mitnahme;
	}

	public double getPassspiel() {
		return passspiel;
	}

	public void setPassspiel(double passspiel) {
		this.passspiel = passspiel;
	}

	public double getDribbling() {
		return dribbling;
	}

	public void setDribbling(double dribbling) {
		this.dribbling = dribbling;
	}

	public double getBeidfüssigkeit() {
		return beidfüssigkeit;
	}

	public void setBeidfüssigkeit(double beidfüssigkeit) {
		this.beidfüssigkeit = beidfüssigkeit;
	}

	public double getKopfball() {
		return kopfball;
	}

	public void setKopfball(double kopfball) {
		this.kopfball = kopfball;
	}

	public double getSchusstechnik() {
		return schusstechnik;
	}

	public void setSchusstechnik(double schusstechnik) {
		this.schusstechnik = schusstechnik;
	}

	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
