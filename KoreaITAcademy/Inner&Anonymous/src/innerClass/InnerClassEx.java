package innerClass;

public class InnerClassEx {

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
	class InstanceInner {
		int iv = 100;
		final static int CONST = 100;
	}

	static class StaticInner {
		int iv = 100;
		static int cv = 200;
	}
}

