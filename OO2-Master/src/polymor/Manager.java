package polymor;

public class Manager extends Worker{
	

	private Worker[] myWorkers;
	private int lastWorker;
	
	public Manager (String name, int id, int salary,int maxNumberOfWorkers) {
		super(name, id, salary);
		myWorkers=new Worker[maxNumberOfWorkers];
		lastWorker=0;
	}
	public void addWorker(Worker worker) {
		myWorkers[lastWorker++]=worker;
	}
	public String work(String task) {
		int randomWorker=(int)(Math.random()*(lastWorker));
		return myWorkers[randomWorker].work(task);
	}
	public void printData() {
		super.printData();
		System.out.println("here are my workers");
		for (int i = 0; i < lastWorker; i++) {
			myWorkers[i].printData();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		//Worker worker1=new Worker("ross", 1, 1000);
		Engineer engineer1=new Engineer("Pibi", 2, 30000);
		QA qa1=new QA("Joy", 3, 500, 1);
		Manager manager1 =new Manager("Rachel", 10, 400000, 5);
		//manager1.addWorker(worker1);
		manager1.addWorker(qa1);
		manager1.addWorker(engineer1);
		
		System.out.println(manager1.work("nothing"));
		
		
		Worker qa2=new QA("Chandler", 9, 42, 3);
		qa2.printData();
		((QA)qa2).test("Task");
	}

	
	
	
}
