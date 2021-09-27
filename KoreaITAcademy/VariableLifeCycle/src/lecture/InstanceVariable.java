package lecture;

public class InstanceVariable {
	public static void main(String[] args) {
		InstanceVarTest gvt = new InstanceVarTest();
		gvt.setInstanceVar1();
		System.out.println("InstanceVar 변수 값 : " + gvt.instanceVar);
		gvt.setInstanceVar2();
		System.out.println("InstanceVar 변수 값 : " + gvt.instanceVar);
		gvt.setInstanceVar1();
		System.out.println("InstanceVar 변수 값 : " + gvt.instanceVar);
	}
}

class InstanceVarTest {
	int instanceVar = 0;
	
	public void setInstanceVar1() {
		instanceVar++;
	}
	
	public void setInstanceVar2() {
		instanceVar = 10;
	}
}
