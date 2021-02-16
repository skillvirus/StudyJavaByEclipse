package lecture.example;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		//for (int loopCount = 0; loopCount < arrayList.size(); loopCount++) {
		for (int loopCount : arrayList) {
			System.out.println("ArrayList 값 : " + loopCount);
		}
	}

}
