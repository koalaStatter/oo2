package polymor;

public class QA extends Worker{
	private int numberOfTest;
	public QA(String name, int id, int salary,int numberOfTest) {
		super(name, id, salary);
		this.numberOfTest=numberOfTest;
		
	}
	
	public void printData() {
		super.printData();
		System.out.println("number of test="+numberOfTest);
	}

	
	public String work(String task) {
		
		return "found a bug in "+task;
	}
	
	public int test(String task) {
		return 5;
	}
	
	
	
	

}
