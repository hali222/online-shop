package myShop;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.*;

public class OnlineShop {

	private static Logger logger = LogManager.getRootLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		//try {
		//	int d = 23/0;
		//	System.out.println("i am try");
		//}
		//catch(ArithmeticException ex) {
		//	System.out.println("I am Exception");
		//}
		//finally {
		//	System.out.println("I am finally");
		//}
		//float a = 123.4f;
		//System.out.println(a);
		
		// int q = 10;
		 //System.out.println(q);
		 //System.out.println(add(q));
		// System.out.println(q);
		 
		 
		Kunde h = new Kunde();
		System.out.println(h.getMindestbestellwert());
		
		Kunde kunde1 = new Kunde();
		
		kunde1.setVorname("Anna");
		kunde1.setName("Schwatz");
		kunde1.setGeschlecht("weiblich");
		kunde1.setPremiumKunde(true);
		System.out.println("This is information from kunde1 : " + kunde1.getVorname() + " "
		+ kunde1.getName() + " " + kunde1.getGeschlecht()
		+ " " + kunde1.isPremiumKunde());
		
		Warenkorb wk1 = new Warenkorb();
		wk1.anzahlArtikel = 2;
		wk1.summeArtikel = 47.50f;
		wk1.gutscheinEingeloest = false;
		
		float total = wk1.berechneSumme(kunde1);
		
		System.out.println("Total amount of" +" "+ kunde1.getVorname() +" "+
	    kunde1.getName() +" " + "is" +" "+ total);
		
		
		Autor aut1 = new Autor("Adam", "Smith"); 
		Autor aut2 = new Autor("Ali", "Nasirzada");
		Autor aut3 = new Autor("Halima", "Zolfaghari");
		Autor aut4 = new Autor("Sofia", "Schwatz", 23);
	
		Buch buch1 = new Buch();
		Buch buch2 = new Buch();
		buch1.setAutor(aut2);
		buch2.setAutor(aut1);
		
		
		
		//Das ist f�r �bung Lektion 2
		Kunde kunde2 = new Kunde("Lion","Sesam","m�nnlich","21.10.1972");
		kunde2.ausgeben();
		System.out.println(kunde2.equals(kunde1));
		System.out.println(kunde2.toString());
		System.out.println(kunde2.getClass());
		System.out.println(kunde2.hashCode());
		kunde1.ausgeben();
		System.out.println(kunde1.hashCode());
		
		
		Kunde kunde3 = new Kunde();
		kunde3.setVorname("Annable");
		kunde3.setName("Br�cke");
		kunde3.setGeschlecht("weiblich");
		
		System.out.println(kunde3.hashCode());
		
		 System.out.println(kunde1.hashCode() == kunde3.hashCode());
		
		 System.out.println(kunde1.equals(kunde3));
		
		 System.out.println(kunde1==kunde3);
		 
		
		 
		 Kunde kunde4 = new Kunde();
			kunde4.setVorname("Heidi");
			kunde4.setName("Kika");
			kunde4.setGeschlecht("");
		 
		 ArrayList<Kunde> arKunde = new ArrayList<Kunde>();
		 arKunde.add(kunde1);
		 arKunde.add(kunde2);
		 arKunde.add(kunde3);
		 arKunde.add(kunde4);
		 
		// System.out.println("arkund" + arKunde.toString());
		 
		 
		 
		 KundenVerwaltung kv = new KundenVerwaltung();
		 KundenVerwaltung kv1 = new KundenVerwaltung();
		
//		 kv.addKunde(kunde1);
//		 kv.addKunde(kunde2);
//		 kv.addKunde(kunde3);
//		 kv.addKunde(kunde4);
		 
		 kv.addKunden(arKunde);
		
		 System.out.println("Alle Kunden: " + kv.getKunden().toString());
		 
		System.out.println("This is my vorname : " + kv.getKunden().get(1).getVorname());
		 
		 //kv.getKunde("Lion");
		 System.out.println("This is my Kunde " + kv.getKunde("Anna"));
		 
		 ArrayList<Kunde> weibKunden = kv.getWeiblicheKunden(kv.getKunden());
		 
		 for(Kunde kunde : weibKunden) {
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
		 

		 
		 
		 
		//aut1.setVorname("Adam");
		//aut1.setName("Smith");
		
		//Artikel a = new Buch();
		
		//aut2.setVorname("Ali");
		//aut2.setName("Nasirzada");
		
		
		
		
//		buch1.setTitle("Buch,B�cher,B�chner");
//		buch1.setHersteller("V Vorlage");
//		buch1.setArtikelnummer("ww");
//		
//		System.out.println(buch1.getBeschreibung());
//		
//		System.out.println(buch1.getTwitterBeschreibung());
//		
//		Kunde k2 = new Kunde("Alic", "Lila", "April", "weiblich");
//		System.out.println(k2.getMindestbestellwert());
//	
//		k2.getWarenkorb().berechneSumme(k2);
//		
//		Kunde k3 = new Kunde();
//		System.out.println(k3.getMindestbestellwert());
	}

	//public static int add(int w) {
		//w= w + 5;
		//return w;
	//}
}
