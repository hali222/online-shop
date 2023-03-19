package myShop;

public class Autor {
	private String vorname;
	private String name;
	private int age;
	
	public Autor(String vorname, String nachname) {
		this.vorname = vorname;
		this.name = nachname;
		this.age = -9;
	}
	
	public Autor(String vorname, String nachname, int age) {
		this.vorname = vorname;
		this.name = nachname;
		this.age = age;
	}
	
	public Autor() {
		this.vorname = "A";
		this.name = "B";
		this.age = -9;
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
	}
