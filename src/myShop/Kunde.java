package myShop;
/**
 * @version 1
 * @author Halima
 *
 */
public class Kunde {

	public static int counter = 0;
	private String vorname;
	private String name;
	private String geschlecht;
	private boolean premiumKunde;
	private String geburtsdatum;
	private Warenkorb warenkorb;
	private double mindestbestellwert;
	private int kundennummer;
	
	
	/**
	 * 
	 * @throws NullPointerException
	 * hier werden NullPointerException vermieden
	 */
	public Kunde() throws NullPointerException{
		
		warenkorb = null;
		//double s = warenkorb.summeArtikel;
		
		
		mindestbestellwert = 10;
	}
	
	public Kunde(String vorname, String name, String geschlecht, String datum) {
		this.vorname = vorname;
		this.name = name;
		this.geburtsdatum = datum;
		this.geschlecht = geschlecht;
		warenkorb = new Warenkorb();
		mindestbestellwert = 10;
		this.kundennummer = counter + 1;
		//counter++;
	}
	
	public Kunde(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
		warenkorb = new Warenkorb();
		mindestbestellwert = 10;
		this.kundennummer = counter + 1;
		//counter++;
	}
	
	public int getKundennummer() {
		return kundennummer;
	}
	
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	
	public double getMindestbestellwert() {
		return mindestbestellwert;
	}

	public void setMindestbestellwert(double mindestbestellwert) {
		this.mindestbestellwert = mindestbestellwert;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGeschlecht() {
		return geschlecht;
	}
	
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	public boolean isPremiumKunde() {
		return premiumKunde;
	}
	
	public void setPremiumKunde(boolean premiumKunde) {
		this.premiumKunde = premiumKunde;
	}
	
	public void ausgeben() {
		System.out.println(vorname +" "+ name +" "+ geschlecht +" "+ geburtsdatum);
	}
	
	public String toString() {
		return (vorname +" "+ name +" "+ geschlecht +" "+ geburtsdatum);
	}
	
	public int hashCode() {
		String s = name + vorname;
		return s.hashCode();
	}
}
