package InterfaceEx;

public class Computer implements Electronics {
	
	String name;
	
	public Computer (String name) {
		this.name = name;
	}

	@Override
	public void turnOn() {
		System.out.println(name + "를(을) 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "를(을) 끕니다.");
	}
}
