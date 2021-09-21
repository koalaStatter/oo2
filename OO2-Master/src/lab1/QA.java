package lab1;

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
	
	

}
