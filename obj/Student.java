package obj;

public class Student extends Person {
	private int avg;
	private String[] coursesTaken;
	
	
	public Student(String name, int age, 
			String id,int avg,int maxCourse) {
		super(name, age, id);
		this.avg=avg;
		coursesTaken=new String[maxCourse];
	}
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if(!(super.equals(other))){
				return false;
			}
			else {
				return other.avg==avg;
			}
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Person person=new Student("Ross", 30, "23123213", 90, 5);
		Student person1=new Student("Ross", 30, "23123213", 90, 5);
		System.out.println(person==person1);
		System.out.println(person.equals(person1));
	
	
	}
	
}
