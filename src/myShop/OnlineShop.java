package myShop;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.*;

public class OnlineShop {

	private static Logger logger = LogManager.getRootLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kunde h = new Kunde();
		System.out.println(h.getMindestbestellwert());

		Kunde kunde1 = new Kunde();

		kunde1.setVorname("Anna");
		kunde1.setName("Schwatz");
		kunde1.setGeschlecht("weiblich");
		kunde1.setPremiumKunde(true);
		System.out.println("This is information from kunde1 : " + kunde1.getVorname() + " " + kunde1.getName() + " "
				+ kunde1.getGeschlecht() + " " + kunde1.isPremiumKunde());

		Warenkorb wk1 = new Warenkorb();
		wk1.anzahlArtikel = 2;
		wk1.summeArtikel = 47.50f;
		wk1.gutscheinEingeloest = false;

		float total = wk1.berechneSumme(kunde1);

		System.out.println("Total amount of" + " " + kunde1.getVorname() + " " + kunde1.getName() + " " + "is" + " " + total);

		Autor aut1 = new Autor("Adam", "Smith");
		Autor aut2 = new Autor("Robert", "Bosch");
		Autor aut3 = new Autor("Halima", "Zolfaghari");
		Autor aut4 = new Autor("Sofia", "Schwatz", 23);

		Buch buch1 = new Buch();
		Buch buch2 = new Buch();
		buch1.setAutor(aut2);
		buch2.setAutor(aut1);

		Kunde kunde2 = new Kunde("Lion", "Sesam", "m�nnlich", "21.10.1972");
		kunde2.ausgeben();
		System.out.println(kunde2.equals(kunde1));
		System.out.println(kunde2.toString());
		System.out.println(kunde2.getClass());
		kunde1.ausgeben();

		Kunde kunde3 = new Kunde();
		kunde3.setVorname("Annable");
		kunde3.setName("Br�cke");
		kunde3.setGeschlecht("weiblich");

		System.out.println(kunde3.hashCode());

		System.out.println(kunde1.hashCode() == kunde3.hashCode());

		System.out.println(kunde1.equals(kunde3));

		System.out.println(kunde1 == kunde3);

		Kunde kunde4 = new Kunde();
		kunde4.setVorname("Heidi");
		kunde4.setName("Kika");
		kunde4.setGeschlecht("");

		ArrayList<Kunde> arKunde = new ArrayList<Kunde>();
		arKunde.add(kunde1);
		arKunde.add(kunde2);
		arKunde.add(kunde3);
		arKunde.add(kunde4);

		KundenVerwaltung kv = new KundenVerwaltung();
		KundenVerwaltung kv1 = new KundenVerwaltung();


		kv.addKunden(arKunde);

		System.out.println("Alle Kunden: " + kv.getKunden().toString());

		System.out.println("This is my vorname : " + kv.getKunden().get(1).getVorname());

		System.out.println("This is my Kunde " + kv.getKunde("Anna"));

		ArrayList<Kunde> weibKunden = kv.getWeiblicheKunden(kv.getKunden());

		for (Kunde kunde : weibKunden) {
			System.out.println("weibliche Kunde " + kunde.getVorname() + " " + kunde.getGeschlecht());
		}

		System.out.println("Alle Kunden: " + kv.getKunden().toString());

		kv.bereinigeAlleKunden(kv.getKunden());

		System.out.println("Berinigte Kunden: " + kv.getKunden().toString());

		System.out.println("Alle Kunden 2: " + kv.getKunden().toString());

		logger.info(kunde3);

		Scanner sc = new Scanner(System.in);

		System.out.println("please insert your name?:");

		String s = sc.next();

		sc.close();

		System.out.println("Your name is: " + s);
	}

}
