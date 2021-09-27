package lecture;

public class ClassVariable {

	public static void main(String[] args) {
		System.out.println("ClassVar 변수 값 : " + ClassVarTest.classVar);
		ClassVarTest.setClassVar();
		System.out.println("ClassVar 변수 값 : " + ClassVarTest.classVar);
	}
}

class ClassVarTest {
	static int classVar = 0;
	
	public static void setClassVar() {
		classVar = 10;
	}
}
