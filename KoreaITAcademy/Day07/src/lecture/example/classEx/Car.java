package lecture.example.classEx;

public class Car {

	private String carName;
	private int oilValue;
	
	public Car () {
	}
	
	public Car (String carName) {
		this.carName = carName;
	}
	
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
	
	public int getOilValue() {
		return this.oilValue;
	}
	
	public String getCarName() {
		return this.carName;
	}
}
