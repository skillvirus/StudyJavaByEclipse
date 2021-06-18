package lecture.example.classEx03;

public class Car extends Vehicle {
	private int fuelLevel;
	private int speedLevel;
	private String type;
	private String name;
	private final int MaxSpeedLevel = 100;
	
	public Car() {
	}
	
	public Car(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public void fillFuel() {
		fuelLevel++;
	}
	
	public int getFuelLevel() {
		return this.fuelLevel;
	}

	public int getSpeedLevel() {
		return this.speedLevel;
	}
	
	@Override //어노테이션 //오버라이드
	public void upSpeedLevel() {
		if (this.speedLevel > this.MaxSpeedLevel) {
			System.out.println("최대속도 초과");
			return;
		} else {
			this.speedLevel++;
		}
		
//		this.speedLevel++;
//		
//		if (this.speedLevel > this.MaxSpeedLevel) {
//			System.out.println("최대속도 초과");
//			this.speedLevel--;
//			return;
//		}
	}
	
	public void downSpeedLevel() {
		this.speedLevel--;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
