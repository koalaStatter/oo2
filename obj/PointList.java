package obj;

import java.util.Arrays;

public class PointList {	
	
	public static void main(String[] args) {
		Point2D[] list1=new Point2D[3];
		Point2D[] list2=new Point2D[3];
		for (int i = 0; i < list2.length; i++) {
			list1[i]=new Point2D(i, i);
			list2[i]=new Point2D(i, i);
		}
		System.out.println(Arrays.equals(list1, list2));
					
	}
	

}
