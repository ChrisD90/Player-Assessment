/**
 * 
 */
package model;

import java.io.Serializable;


/**
 * @author Christoph
 *
 */
public class Player implements Serializable{


	double total;

	double technik;
	double technik_ballan_mitnahme;
	double technik_passspiel;
	double technik_dribbling;
	double technik_beidfüssigkeit;
	double technik_kopfball;
	double technik_schusstechnik;

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
		return technik_ballan_mitnahme;
	}

	public void setBallan_mitnahme(double ballan_mitnahme) {
		this.technik_ballan_mitnahme = ballan_mitnahme;
	}

	public double getPassspiel() {
		return technik_passspiel;
	}

	public void setPassspiel(double passspiel) {
		this.technik_passspiel = passspiel;
	}

	public double getDribbling() {
		return technik_dribbling;
	}

	public void setDribbling(double dribbling) {
		this.technik_dribbling = dribbling;
	}

	public double getBeidfüssigkeit() {
		return technik_beidfüssigkeit;
	}

	public void setBeidfüssigkeit(double beidfüssigkeit) {
		this.technik_beidfüssigkeit = beidfüssigkeit;
	}

	public double getKopfball() {
		return technik_kopfball;
	}

	public void setKopfball(double kopfball) {
		this.technik_kopfball = kopfball;
	}

	public double getSchusstechnik() {
		return technik_schusstechnik;
	}

	public void setSchusstechnik(double schusstechnik) {
		this.technik_schusstechnik = schusstechnik;
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
