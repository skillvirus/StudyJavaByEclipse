package practice;

public class MainClass {

	public static void main(String[] args) {
		Point original = new Point(5, 3);
		Point copy = (Point)original.clone(); //복제
		
		System.out.println(original);
		System.out.println(copy);
	}

}
