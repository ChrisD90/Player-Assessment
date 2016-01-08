/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author Christoph
 *
 */
public class Player implements Serializable {

	// GESAMTBEWERTUNG
	double[] tot = new double[5];
	// 0 --> total_Player
	// 1 --> total_tech
	// 2 --> total_tak
	// 3 --> total_ath
	// 4 --> total_pers

	// TECHNIK
	double[] tech = new double[7];
	// 0 --> total
	// 1 --> ballan_mitnahme
	// 2 --> passspiel
	// 3 --> dribbling
	// 4 --> beidfüssigkeit
	// 5 --> kopfball
	// 6 --> schuss

	// TAKTIK
	double[] tak = new double[11];
	// 0 --> total
	// 1 --> 1:1_offensiv
	// 2 --> 1:1_defensiv
	// 3 --> gruppe_offensiv
	// 4 --> gruppe_defensiv
	// 5 --> freilaufen
	// 6 --> umschalten_off
	// 7 --> umschalten_def
	// 8 --> zug_Tor
	// 9 --> kreativität
	// 10 -->spielerfahrung

	// ATHLETIK
	double[] ath = new double[7];
	// 0 --> total
	// 1 --> bewegungschnschnelligkeit
	// 2 --> aktionsschnelligkeit
	// 3 --> aktionschn_Spielzeit
	// 4 --> kraft
	// 5 --> koordination
	// 6 --> biolog_Alter

	// PERSÖNLICHKEIT
	double[] pers = new double[8];
	// 0 --> total
	// 1 --> versteht_Anweisungen
	// 2 --> umsetzen_Anweisungen
	// 3 --> einordnen
	// 4 --> kommunikation
	// 5 --> selbstbewusst
	// 6 --> wille
	// 7 --> eltern


	String name;
	String prename;
	String birthday;
	String id;

	// --------------------------------------------------------------
	// Konstruktor
	// --------------------------------------------------------------
	public Player(String name, String prename, String birthday) {

		this.name = name;
		this.prename = name;
		this.birthday = birthday;
		
		id = name + ", " + prename + ": " +  birthday;
	}

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TECHNICS
	// --------------------------------------------------------------
	public void setTechnik_total() {
		int x = 0;
		for (int i = 1; i < tech.length; i++) {
			x += tech[i];
		}
		tech[0] = x/6;
		
		System.out.println("Technik_total: " + tech[0]);
	}
	
	public void setTechnik_Ballan(double x) {
		tech[1] = x;
	}

	public void setTechnik_Pass(double x) {
		tech[2] = x;
	}

	public void setTechnik_Dribbling(double x) {
		tech[3] = x;
	}

	public void setTechnik_Beidf(double x) {
		tech[4] = x;
	}

	public void setTechnik_Kopfball(double x) {
		tech[5] = x;
	}

	public void setTechnik_Schuss(double x) {
		tech[6] = x;
	}

	// --------------------------------------------------------------
	
	public double getTechnik_total() {
		return tech[0];
	}
	
	public double getTechnik_Ballan() {
		return tech[1];
	}

	public double getTechnik_Pass() {
		return tech[2];
	}

	public double getTechnik_Dribbling() {
		return tech[3] ;
	}

	public double getTechnik_Beidf() {
		return tech[4];
	}

	public double getTechnik_Kopfball() {
		return tech[5] ;
	}

	public double getTechnik_Schuss() {
		return tech[6] ;
	}



	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TACTICS
	// --------------------------------------------------------------

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: ATHELTICS
	// --------------------------------------------------------------

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: PERSONALITY
	// --------------------------------------------------------------

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TOTAL
	// --------------------------------------------------------------
	public void setTotal_Techs() {
		setTechnik_total();
		tot[1] = tech[0];
	}
	
	public void setTotal_Tak() {
		//setTaktik_total();
		tot[2] = tak[0];
	}
	
	public void setTotal_Ath() {
		//setAth_total();
		tot[3] = ath[0];
	}
	
	public void setTotal_Pers() {
		//setPers_Total();
		tot[4] = pers[0];
	}
	
	public void setTotal_Player() {
		for(int i =1; i <= tot.length; i++) {
			tot[0] += tot[i];
		}
	}
	
	public double getTotal_Player() {
		return tot[0];
	}
	
	// --------------------------------------------------------------
	// GETTERS FOR ARRAYS
	// --------------------------------------------------------------
	public double[] getTechArray() {
		return tech;
	}

	public double[] getTakArray() {
		return tak;
	}

	public double[] getAthArray() {
		return ath;
	}

	public double[] getPersArray() {
		return pers;
	}
	
	public double[] getTotalArray() {
		return tot;
	}
	
	// --------------------------------------------------------------
	// NAME
	// --------------------------------------------------------------
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

	public String getBirthday() {
		return birthday;
	}

	public String getID() {
		return id;
	}

}
