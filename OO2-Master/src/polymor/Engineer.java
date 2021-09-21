package polymor;

public class Engineer extends Worker{

	public Engineer(String name, int id, int salary) {
		super(name, id, salary);
		
	}

	
	public void printData() {
		
		System.out.println("id="+getId());
	}


	
	public String work(String task) {
		return "done this was a simple task no need to test";
	}
	

}
