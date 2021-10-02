package interfacePackage;

import java.util.Arrays;
import java.util.Comparator;



public class PersonCompartor implements Comparator<Person> {

	
	@Override
	public int compare(Person arg0, Person arg1) {
		String name0=arg0.getName();
		String name1=arg1.getName();
		return name0.compareTo(name1);
//		int val=name0.compareTo(name1);
//		if(val<0) {
//			return -1;
//		}
//		if(val>0) {
//			return 1;
//		}
//		return 0;
	}

	public static void main(String[] args) {
		Comparator com=new PersonCompartor();
		Person p1=new Person("Pibi", 32, "454545");
		Person p2=new Person("Monick", 30, "343434");
		Person p3=new Person("Ross", 31, "334");
		Person p4=new Person("Joy", 29, "3143434");
		System.out.println(com.compare(p2, p1));
		Person[] personsList=new Person[4];
		personsList[0]=p1;
		personsList[1]=p2;
		personsList[2]=p3;
		personsList[3]=p4;
		System.out.println(Arrays.toString(personsList));
		//Arrays.sort(personsList,com);
		Arrays.sort(personsList);
		System.out.println(Arrays.toString(personsList));
	}
}
