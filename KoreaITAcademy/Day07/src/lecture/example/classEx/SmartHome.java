package lecture.example.classEx;

public class SmartHome {
	public static void main(String[] args) {

		Television tvInLivingRoom = new Television("거실");
		tvInLivingRoom.turnOn();
		
		Television tvInMainRoom = new Television("안방");
		tvInMainRoom.turnOn();
		tvInMainRoom.turnOff();
		
		Television tvInSmallRoom = new Television("작은방");
		tvInSmallRoom.turnOn();
		
		System.out.println(tvInLivingRoom.getTVName());
	}

}
