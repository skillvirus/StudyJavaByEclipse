package lecture.example.classEx;

public class Car {

	int oilValue;
	
	public void turnOn() {
		System.out.println("시동을 걸다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끄다.");
	}
	
	public void fillOil() {
		this.oilValue++;
	}
	
	public void drive() {
		this.oilValue--;
	}
}
