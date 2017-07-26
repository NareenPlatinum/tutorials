public class Cat extends Animal{
  
	protected String name;
	protected int    birthYear;
	public String getName(){ return this.name; }
	public int    getBirthyear(){ return this.birthYear; }
  public abstract String noise();

	public Animal(String name, int year){
		this.name = name;
		this.birthYear = year;
	}
  
}
