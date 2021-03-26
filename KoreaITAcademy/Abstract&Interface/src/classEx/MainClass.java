package classEx;

public class MainClass {

	public static void main(String[] args) {

		//Human
		System.out.println("-----Human-----");
		Human johnDoe = new Human(20);
		johnDoe.move();
		johnDoe.takeNutrition();
		
		System.out.println("Human JohnDoe의 나이는 " + johnDoe.getAge() + "입니다.");
		System.out.println();
		
		//Dog
		System.out.println("-----Dog-----");
		Dog puppy = new Dog(10);
		puppy.move();
		puppy.takeNutrition();
		
		System.out.println("Dog Puppy의 나이는 " + puppy.getAge() + "입니다.");
		System.out.println();
		
		//Bird
		System.out.println("-----Bird-----");
		Bird pigeon = new Bird(5);
		pigeon.fly();
		pigeon.move();
		pigeon.takeNutrition();
		
		System.out.println("Bird Pigeon의 나이는 " + pigeon.getAge() + "입니다.");
		System.out.println();
		
		//Tree
		System.out.println("-----Tree-----");
		Tree pine = new Tree(50);
		pine.takeNutrition();
	}

}
