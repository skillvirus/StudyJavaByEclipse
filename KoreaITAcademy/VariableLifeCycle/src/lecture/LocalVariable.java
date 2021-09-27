package lecture;

public class LocalVariable {

	public static void main(String[] args) {
		int a = 2;
		System.out.println("변수 a : " + a);
	}
	
	public void setLocalVar() {
		int a = 1; //정의된 변수는 메소드 내에서만 접근 가능
	}
}
