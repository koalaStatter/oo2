package polymor;
import inheritance.*;
public class InstanceExample {

	public static void main(String[] args) {
		Student ross=new Student("Ross", 30, "23123213", 90, 5);
		Person pibi=new Person("Pibi",30,"12121");
		System.out.println(pibi.getClass().getSimpleName());
		System.out.println(ross.getClass().getSimpleName());
		System.out.println(ross instanceof Person);
		System.out.println(ross instanceof Student);
		System.out.println(pibi instanceof Person);
		System.out.println(pibi instanceof Student);
	}

}
