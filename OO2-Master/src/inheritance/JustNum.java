package inheritance;

public class JustNum {
	private int num;
	public JustNum() {
		this(42);
		System.out.println("in JustNum con 1 ");
		
	
	}
	public JustNum(int num) {
		this.num=num;
		System.out.println("in JustNum con 2 ");
	}

}
