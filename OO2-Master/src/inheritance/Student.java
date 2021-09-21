package inheritance;

public class Student extends Person {
	private int avg;
	private String[] coursesTaken;
	
	
	public Student(String name, int age, 
			String id,int avg,int maxCourse) {
		super(name, age, id);
		this.avg=avg;
		coursesTaken=new String[maxCourse];
	}
	
	public static void main(String[] args) {
		Person person=new Student("Ross", 30, "23123213", 90, 5);
		if (person instanceof Person) {
		}
	
	
	}
	
}
