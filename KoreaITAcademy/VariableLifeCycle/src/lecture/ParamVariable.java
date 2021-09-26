package lecture;

public class ParamVariable {

	public static void main(String[] args) {
		ParamVarTest pvt = new ParamVarTest();
		System.out.println(pvt.getParamVar());
	}
}

class ParamVarTest {
	
	int param = 0;
	
	public void setParamVar1(int param) {
		param++;
	}
	
	public void setParamVar2(int param) {
		param = 10;
	}
	
	public int getParamVar() {
		return param;
	}
}
