package inheritance;

public class MoreThenANum extends JustNum{
	
	public MoreThenANum() {
		System.out.println("in More then a num 1 ");
	}

	public MoreThenANum(int num) {
		super(num);
		System.out.println("in More then a num 2 ");
	}

	public static void main(String[] args) {
		JustNum a=new JustNum();
		JustNum b=new JustNum(9);
		MoreThenANum c=new MoreThenANum();
		MoreThenANum d=new MoreThenANum(3);
	}

}
