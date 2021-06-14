package lecture.example.classInheritance;

public class AISpeaker extends Electronics {
	public AISpeaker() {
	}
	
	public AISpeaker(String name, String location) {
		super(name, location);
	}
	
	public static void reply() {
		System.out.println("네~");
	}
}
