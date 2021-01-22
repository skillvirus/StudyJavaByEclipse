package lecture.test;

import java.util.Scanner; 

public class InputPractice {
	public static void main(String[] args) {
		
		String name; //이름
		int age; //나이
		double height; //키
		double weight; //몸무게
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = inputScanner.next();
		
		System.out.print("나이를 입력하세요 : ");
		age = inputScanner.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		height = inputScanner.nextDouble();
		
		System.out.print("몸무게를 입력하세요 : ");
		weight = inputScanner.nextDouble();
		
		System.out.println();
		
		System.out.println("당신의 이름은 \"" + name + "\"입니다.");
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println("당신의 키는 " + height + "cm 입니다.");
		System.out.println("당신의 몸무게는 " + weight + "kg 입니다.");
		
		inputScanner.close();
	}
}
