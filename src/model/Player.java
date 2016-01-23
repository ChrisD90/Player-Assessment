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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	// 4 --> beidf�ssigkeit
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
	// 9 --> kreativit�t
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

	// PERS�NLICHKEIT
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
		this.prename = prename;
		this.birthday = birthday;

		id = name + ", " + prename + ": " + birthday;
	}

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TECHNICS
	// --------------------------------------------------------------
	public void setTechnik_total() {
		double x = 0;
		for (int i = 1; i < tech.length; i++) {
			x += tech[i];
		}
		tech[0] = x;

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
		return tech[3];
	}

	public double getTechnik_Beidf() {
		return tech[4];
	}

	public double getTechnik_Kopfball() {
		return tech[5];
	}

	public double getTechnik_Schuss() {
		return tech[6];
	}

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TACTICS
	// --------------------------------------------------------------
	public void setTaktik_total() {
		double x = 0;
		for (int i = 1; i < tak.length; i++) {
			x += tak[i];
		}
		tak[0] = x;

		System.out.println("Technik_total: " + tak[0]);
	}
	

	public void setTaktik_1off(double x) {
		tak[1] = x;
	}

	public void setTaktik_1def(double x) {
		tak[2] = x;
	}

	public void setTaktik_gruppeOff(double x) {
		tak[3] = x;
	}

	public void setTaktik_gruppeDef(double x) {
		tak[4] = x;
	}

	public void setTaktik_freilaufen(double x) {
		tak[5] = x;
	}

	public void setTaktik_umschaltOff(double x) {
		tak[6] = x;
	}

	public void setTaktik_umschaltDef(double x) {
		tak[7] = x;
	}

	public void setTaktik_zugZumTor(double x) {
		tak[8] = x;
	}

	public void setTaktik_kreativit�t(double x) {
		tak[9] = x;
	}

	public void setTaktik_spielerfahrung(double x) {
		tak[10] = x;
	}

	// --------------------------------------------------------------
	
	public double getTaktik_total() {
		return tak[0];
	}

	public double getTaktik_1off() {
		return tak[1];
	}

	public double getTaktik_1def() {
		return tak[2];
	}

	public double getTaktik_gruppeOff() {
		return tak[3];
	}

	public double getTaktik_gruppeDef() {
		return tak[4];
	}

	public double getTaktik_freilaufen() {
		return tak[5];
	}

	public double getTaktik_umschaltOff() {
		return tak[6];
	}

	public double getTaktik_umschaltDef() {
		return tak[7];
	}

	public double getTaktik_zugZumTor() {
		return tak[8];
	}

	public double getTaktik_kreativit�t() {
		return tak[9];
	}

	public double getTaktik_spielerfahrung() {
		return tak[10];
	}

	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: ATHELTICS
	// --------------------------------------------------------------

	public void setAthletik_total() {
		double x = 0;
		for (int i = 1; i < ath.length; i++) {
			x += ath[i];
		}
		ath[0] = x;

		System.out.println("Athletik_total: " + ath[0]);
	}
	
	public void setAthletik_bewegungsschnelligkeit(double x) {
		ath[1] = x;
	}
	
	public void setAthletik_aktionsschnelligkeit(double x) {
		ath[2] = x;
	}
	
	public void setAthletik_aktionsschnelligkeitZeit(double x) {
		ath[3] = x;
	}
	
	public void setAthletik_kraft(double x) {
		ath[4] = x;
	}
	
	public void setAthletik_koordination(double x) {
		ath[5] = x;
	}
	
	public void setAthletik_biologAlter(double x) {
		ath[6] = x;
	}
	
	
	public double getAthletik_total() {
		return ath[0];
	}
	
	public double getAthletik_bewegungsschnelligkeit() {
		return ath[1];
	}
	
	public double getAthletik_aktionsschnelligkeit() {
		return ath[2];
	}
	
	public double getAthletik_aktionsschnelligkeitZeit() {
		return ath[3];
	}
	
	public double getAthletik_kraft() {
		return ath[4];
	}
	
	public double getAthletik_koordination() {
		return ath[5];
	}
	
	public double getAthletik_biologAlter() {
		return ath[6];
	}
	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: PERSONALITY
	// --------------------------------------------------------------
	public void setPers�nlichkeit_total() {
		double x = 0;
		for (int i = 1; i < pers.length; i++) {
			x += pers[i];
		}
		pers[0] = x;

		System.out.println("Pers�nlichkeit_total: " + pers[0]);
	}
	
	public void setPers�nlichkeit_anweisungenVerstehen(double x) {
		pers[1] = x;
	}
	
	public void setPers�nlichkeit_anweisungenUmsetzen(double x) {
		pers[2] = x;
	}
	
	public void setPers�nlichkeit_einordnen(double x) {
		pers[3] = x;
	}
	
	public void setPers�nlichkeit_kommunikation(double x) {
		pers[4] = x;
	}
	
	public void setPers�nlichkeit_selbstbewusstsein(double x) {
		pers[5] = x;
	}
	
	public void setPers�nlichkeit_wille(double x) {
		pers[6] = x;
	}
	
	public void setPers�nlichkeit_eltern(double x) {
		pers[7] = x;
	}
	
	public double getPers�nlichkeit_total() {
		return pers[0];
	}
	
	public double getPers�nlichkeit_anweisungenVerstehen() {
		return pers[1];
	}
	
	public double getPers�nlichkeit_anweisungenUmsetzen() {
		return pers[2] ;
	}
	
	public double getPers�nlichkeit_einordnen() {
		return pers[3] ;
	}
	
	public double getPers�nlichkeit_kommunikation() {
		return pers[4] ;
	}
	
	public double getPers�nlichkeit_selbstbewusstsein() {
		return pers[5] ;
	}
	
	public double getPers�nlichkeit_wille() {
		return pers[6] ;
	}
	
	public double getPers�nlichkeit_eltern() {
		return pers[7];
	}
	
	
	// --------------------------------------------------------------
	// GETTERS AND SETTERS FOR ARRAY: TOTAL
	// --------------------------------------------------------------
	public void setTotal() {
		
		tot[1] = tech[0];
		tot[2] = tak[0];
		tot[3] = ath[0];
		tot[4] = pers[0];
		
		double x = 0;
		for (int i = 1; i < tot.length; i++) {
			x += tot[i];
		}
		tot[0] = x / 4;
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
	
	public void setBirthday(String s) {
		this.birthday = s;
	}

}
