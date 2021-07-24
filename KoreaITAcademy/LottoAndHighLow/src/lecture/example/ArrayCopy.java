package lecture.example;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] Arr1 = {10, 20, 30, 40, 50}; 
		int[] Arr2 = Arr1;
		
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println("Arr1[" + i + "] = " + Arr1[i]);
			System.out.println("Arr2[" + i + "] = " + Arr2[i]);
		}
		
		Arr2[0] = 100;
		Arr2[1] = 200;
		Arr2[2] = 300;
		Arr2[3] = 400;
		Arr2[4] = 500;
		
		System.out.println(); //빈행 한줄 출력
		
		for (int i = 0; i < Arr1.length; i++) {
			System.out.println("Arr1[" + i + "] = " + Arr1[i]);
			System.out.println("Arr2[" + i + "] = " + Arr2[i]);
		}
	}
}
