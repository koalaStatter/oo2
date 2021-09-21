package lab1;

public class Engineer extends Worker{

	public Engineer(String name, int id, int salary) {
		super(name, id, salary);
		
	}

	
	public void printData() {
		
		System.out.println("id="+getId());
	}
	

}
