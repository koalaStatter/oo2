package inheritance;

public class Dog {
	private  String name;
	private int strength;
	
	public Dog(String name, int strength) {
//		super();
		this.name = name;
		this.strength = strength;
	}
	public String sayName() {
		return name;
	}
	public String makeSound() {
		return "HAV HAV";
	}
	
	public static void main(String[] args) {
		Dog d =new Dog("Dika",10);
		System.out.println(d.makeSound());
		
	}
}	

