package myShop;

import java.util.LinkedList;
import java.util.List;


public class Warenkorb {
	private float artikelSumme;
	private List<Artikel> artikelListe = new LinkedList<Artikel>(); 
	
	float anzahlArtikel;
	float summeArtikel;
	boolean gutscheinEingeloest;
	
	public boolean artikelHinzufuegen(int position, Artikel a) {
		try {
			artikelListe.add(position, a);
			artikelSumme += a.getPreis();
		} catch(IndexOutOfBoundsException ex) {
			return false;
		}
		
		return true;
	}
	
	public boolean artikelHinzufuegen(Artikel a) {
		boolean erfolgreich = artikelListe.add(a);
		if(erfolgreich)
			artikelSumme += a.getPreis();
		return erfolgreich;
	}
	
	public boolean artikelEntfernen(Artikel a) {
		boolean erfolgereich = artikelListe.remove(a);
		if(erfolgereich)
			artikelSumme -= a.getPreis();
		return erfolgereich;
	}
	
	public void leerWarenkorb() {
		artikelListe.clear();
		artikelSumme = 0;
	}
	
	public int getAnzahlArtikel() {
		return artikelListe.size();
	}
	
	public float berechneSumme(Kunde kun) {
		float result = summeArtikel;
		
		if(kun.isPremiumKunde()) {
			result = summeArtikel * 0.9f;
		}
		else {
			result = summeArtikel * 1f;
		}
		
		return result;
		
	}
	}
	
