package src.be.abis.ExA6.model;

public class Company {

	private String name;
	private Adress adress;
	
	public Company(String name, Adress adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
	
}
