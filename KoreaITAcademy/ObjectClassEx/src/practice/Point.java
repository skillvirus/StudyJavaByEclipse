package practice;

public class Point implements Cloneable {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString( ) {
		return "X = " + x + ", Y = " + y; 
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			
		}
		
		return obj;
	}
}
