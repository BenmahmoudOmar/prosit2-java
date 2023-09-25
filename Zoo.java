

public class Zoo {
	Animal [] animals;
	 String name;
	 String city;
	 int nbrCages;
	public Zoo(String name, String city, int nbrCages) {
		super();
		animals =new Animal[nbrCages];
		this.name = name;
		this.city = city;
		this.nbrCages = nbrCages;
	}
	

	public Animal[] getAnimals() {
		return animals;
	}
	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNbrCages() {
		return nbrCages;
	}
	public void setNbrCages(int nbrCages) {
		this.nbrCages = nbrCages;
	}


}
