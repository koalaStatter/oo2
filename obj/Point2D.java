package obj;

public class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	//@Override
		public boolean equals(Object obj) {
			
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof Point2D)) {
				return false;
			}
			Point2D other = (Point2D) obj;
			if (x != other.x) {
				return false;
			}
			if (y != other.y) {
				return false;
			}
			return true;
		}
	
	
	
	
	
	

}
