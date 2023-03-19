package myShop;

public class OnlineShopWithMap {
	public static void main(String[] args) {
	 ////////////////////////////////////////////////////////
	 //Data Structure Map
	 //////////////////////////////////////////////////////
	 KundenVerwaltungMitMaps kvMaps = new KundenVerwaltungMitMaps();
	 System.out.println("Counter is : " + Kunde.counter);
	 
	 Kunde.counter = 3;
	 
	 System.out.println(kvMaps.getKundedaten(1).getKundennummer());
	 
	 System.out.println(kvMaps.getAlleKunden().toString());
	}
}