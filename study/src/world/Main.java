package world;

public class Main {

	public static void main(String[] args) {
		//Animal animal= new Animal("犬");
		Dog dog = new Dog();
		dog.setName("犬");
		dog.eat();
		//for (int i = 0; i < 10; i++) {
			dog.go();
		//}
		
		Hawk hawk = new Hawk();
		hawk.setName("鷹");
		hawk.go();
		hawk.eat();
		
		
	}
}
