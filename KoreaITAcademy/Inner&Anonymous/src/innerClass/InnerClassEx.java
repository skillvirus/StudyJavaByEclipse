package innerClass;

public class InnerClassEx {

/*
	주로 Swing, AWT 같은 GUI 프로그래밍 이벤트에서 사용
*/
	
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

