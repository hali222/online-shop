package myShop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class KundenVerwaltung {

	private ArrayList<Kunde> kunden = new ArrayList<Kunde>();
	
	
	public void addKunde(Kunde k) {
		this.kunden.add(k);
	}
	
	public void addKunden(Collection<Kunde> c) {
		this.kunden.addAll(c);
	}

	public Kunde getKunde(String vorname) {
		
		Kunde k = null;
		for( Kunde kunde : kunden) {
			if(kunde.getVorname().equals(vorname)) {
				k = kunde;
				break;
			}
		}
		return k;
	}
	
	public ArrayList<Kunde> getKunden() {
		return kunden;
	}
	
	
	
	public void bereinigeAlleKunden(Collection<Kunde> c) {

		Kunde k = null;

		Iterator<Kunde> it = c.iterator();

		while (it.hasNext()) {

			k = it.next();

			if (k.getGeschlecht().equals(""))
				it.remove();
		}

	}

	public ArrayList<Kunde> getWeiblicheKunden(Collection<Kunde> c) {

		Kunde k = null;

		Iterator<Kunde> it = c.iterator();

		//Kunde[] k2 = new Kunde[10]; nicht sinnvoll, da Anzahl Kunde dynamisch
		ArrayList<Kunde> listWeibKunde = new ArrayList<>();
		
		while (it.hasNext()) {
			k = it.next();
			if (k.getGeschlecht().equals("weiblich")) {
				listWeibKunde.add(k);
			}
		}
		return listWeibKunde;
	}
}
