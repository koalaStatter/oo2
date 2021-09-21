package polymor;

public abstract class Worker {
	private String name;
	private int id;
	private int Salary;
	
	public Worker(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		Salary = salary;
	}
	
	public void printData() {
		System.out.println("name = "+name+" id= "+id);
	}
	public abstract String work(String task);
	
	public int getId() {
		return id;
	}
	
	
}
