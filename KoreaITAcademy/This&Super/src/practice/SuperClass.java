package practice;

public class SuperClass {

	public static void main(String[] args) {
		ManClass man = new ManClass(45, 174.5, 70, "송명규");
		man.printHumanInfo();
		man.printHumanInfoWithGender();
	}

}

class HumanClass {
	private int age;
	private double height;
	private double weight;
	private String name;
	
	public HumanClass(int age, double height, double weight, String name) {
		this.age = age; //this 키워드는 객체 자신을 의미
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHuamnInfo() {
		System.out.println(name + "님의 키는 " + height + "cm 이며, 몸무게는 " + weight + "kg 이며, 나이는 " + age + "세 입니다.");
	}
}

class ManClass extends HumanClass {
	
	private String gender = "남자";
	
	public ManClass(int age, double height, double weight, String name) {
		super(age, height, weight, name); //상위 클래스의 생성자 호출
	}

	public void printHumanInfo() {
		super.printHuamnInfo();
	}
	
	public void printHumanInfoWithGender() {
		System.out.println(super.getName() + "님의 키는 " + super.getHeight() + "cm 이며, 몸무게는 " + super.getWeight() + "kg 이며, 나이는 " + super.getAge() + "세 이며, 성별은 " + this.gender + "입니다.");		
	}
}