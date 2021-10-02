package interfacePackage;

public class Person implements Comparable<Person>{
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		 if (!(other instanceof Person)) {
			 return false;
		}
		Person other1 = (Person) other;
		if (age != other1.age || name !=other1.name) {
			return false;
		}
		return true;
	}

	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Person arg0) {
		if(age<arg0.age) {
			return -1;
		}
		if(age>arg0.age) {
			return 1;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		Person person1=new Person("A", 30, "3434");
		Person person2=new Person("B", 30, "3434");
		if(person1==person2) {
			System.out.println("==");
			
		}
		if(person1.equals(person2)) {
			System.out.println("eq");
			
		}
		
	}

	
}
