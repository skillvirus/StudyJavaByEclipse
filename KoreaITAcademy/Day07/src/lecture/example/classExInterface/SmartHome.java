package lecture.example.classExInterface;

public class SmartHome {
	public static void main(String[] args) {
		
		Electronics television = new Television("MainRoom TV");
		Electronics computer = new Computer("MainRoom Computer");
		
		television.turnOn();
		computer.turnOn();
		
		System.out.println();
		
		television.turnOff();
		computer.turnOff();
	}
}
