package practice;

public class ThisClass {

	public static void main(String[] args) {
		Human me = new Human(45, 175.5, 70, "송명규");
		me.printHuamnInfo();
	}

}

class Human {
	private int age;
	private double height;
	private double weight;
	private String name;
	
	public Human(int age, double height, double weight, String name) {
		this.age = age; //this 키워드는 객체 자신을 의미
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	public void printHuamnInfo() {
		System.out.println(name + "님의 키는 " + height + "cm 이며, 몸무게는 " + weight + "kg 이며, 나이는 " + age + "세 입니다.");
	}
}
