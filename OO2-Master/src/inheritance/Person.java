package inheritance;

public class Person {
	private String name;
	private int age;
	private String id;
	
	public Person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	public String sayName() {
		return "my name is "+name;
	}
	
	
	public String getName() {
		return name;
	}

	private String tellMe() {
		return "I know what you did" ;
	}
	

}
