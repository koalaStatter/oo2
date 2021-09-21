package inheritance;

import java.util.Arrays;

public class Teacher extends Person {
	private String[] courses;
	
	public Teacher(String name, int age, String id,int maxNum) {
		super(name, age, id);
		courses=new String[maxNum];
	}

	
	public String toString() {
		return "Teacher name "+getName()+" [courses=" + Arrays.toString(courses) + "]";
	}
	
	

	public static void main(String[] args) {
		Teacher t=new Teacher("Ross", 55, "1", 5);
		System.out.println(t);
	
}	

}
