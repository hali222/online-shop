package myShop;

public class Buch extends Artikel {
	private Autor autor;
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public String getBeschreibung() {
		return hersteller + "; " + artikelnummer + "; " + title + " von: " + autor.getVorname()+ " " + autor.getName();
	}
	
	public String getTwitterBeschreibung() {
		return "Buch : " + title + "von : " + autor.getVorname() + " " + autor.getName(); 
		
	}
}
