package myShop;

public abstract class Artikel {

	protected String hersteller;
	protected String title;
	protected String artikelnummer;
	protected float preis;

	public String getBeschreibung() {
		return hersteller + "; " + artikelnummer + "; " + title;
	}
	
	public String getHersteller() {
		return hersteller;
	}
	
	public float getPreis() {
		return preis;
	}
	
	public void setPreis(float preis) {
		this.preis = preis;
	}
	
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtikelnummer() {
		return artikelnummer;
	}
	
	public void setArtikelnummer(String artikelnummer) {
		this.artikelnummer = artikelnummer;
	}
	
	public abstract String getTwitterBeschreibung();
}

