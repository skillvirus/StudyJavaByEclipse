package lecture.example.classEx03;

public class MainClass {
	public static void main(String[] args) {
		Car tucson = new Car("SUV", "MyCar");
//		tucson.upSpeedLevel();
//		tucson.upSpeedLevel();
		
		for(int i = 1; i <= 100; i++) {
			tucson.upSpeedLevel();
		}
		
		System.out.println(tucson.getName() + "의 현재 속도 : " + tucson.getSpeedLevel() + "km/h");
	}
}
