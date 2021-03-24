package classEx;

public class MainClass {

	public static void main(String[] args) {

		//Human
		Human joneDoe = new Human(20);
		joneDoe.move();
		joneDoe.takeNutrition();
		
		System.out.println();
		
		//Dog
		Dog puppy = new Dog(10);
		puppy.move();
		puppy.takeNutrition();
		
		System.out.println();
		
		//Bird
		Bird pigeon = new Bird(5);
		pigeon.fly();
		pigeon.takeNutrition();
		
		System.out.println();
		
		//Tree
		Tree pine = new Tree(50);
		pine.takeNutrition();
	}

}
