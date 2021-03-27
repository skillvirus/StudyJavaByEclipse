package getterAndsetter;

public class MainClass {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRound(6);
		
		//원의 면적 = 반지름^2 X 3.14
		System.out.println(circle.getRound()*circle.getRound()*circle.getPie());
	}

}
