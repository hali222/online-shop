package myShop;

import java.util.HashMap;
import java.util.Map;

public class KundenVerwaltungMitMaps {
	private Map<Integer, Kunde> kunden;
	private IKundenSpeicher kundenSpeicher = new DBKundenSpeicher();

	public KundenVerwaltungMitMaps() {
		kunden = new HashMap<Integer, Kunde>();
		
		Kunde K1 = new Kunde("Ulf", "Koll");
		Kunde K2 = new Kunde("Ilse", "Stahl");
		
		kunden.put(K1.getKundennummer(), K1);
		kunden.put(K2.getKundennummer(), K2);
		
		//for(Kunde k: kunden.values())
			//System.out.println(k);
	}
	
	public void aktualisiereAlleKunden() {
		for(Kunde k: kunden.values())
			kundenSpeicher.aktualisieren(k);
	}
	
	public Kunde getKundedaten(int KundenNr) {
		Kunde k = kunden.get(KundenNr);
		return k;
	}
	
	public Map<Integer, Kunde> getAlleKunden(){
		return kunden;
	}
}
