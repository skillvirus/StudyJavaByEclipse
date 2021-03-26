package interfaceEx;

public class Television implements Electronics {
	
	String name;
	
	public Television(String name) {
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