package myShop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Sortiment {

	private Set<Artikel> sortiment = new HashSet<Artikel>();
	
	public boolean neuerArtikel(Artikel b) {
		return sortiment.add(b);
	}
	
	public boolean entferneArtikel(Artikel b) {
		return sortiment.remove(b);
	}
	
	public boolean pruefeBestellung(Collection<Artikel> bestellung) {
		return sortiment.containsAll(bestellung);
	}
	
	public Set<Artikel> ermittleVerfuegbareArtikel (Set<Artikel> bestellung){
		Set<Artikel> verfuegbareArtikel = new HashSet<Artikel>(sortiment);
		verfuegbareArtikel.retainAll(bestellung);
		return verfuegbareArtikel;
	}
	
	public Set<Artikel> ermittleFehlendeArtikel(Set<Artikel> pruefListe){
		Set<Artikel> fehlendeArtikel = new HashSet<Artikel>(sortiment);
		fehlendeArtikel.removeAll(pruefListe);
		return fehlendeArtikel;
	}
	
	public boolean erweitereSortiment(Collection<Artikel> neueArtikel) {
		return sortiment.addAll(neueArtikel);
	}
}
