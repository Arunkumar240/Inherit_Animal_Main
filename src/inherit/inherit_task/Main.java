package inherit.inherit_task;

class Animal {
	public void animalSound() {
		System.out.println("Animal use to make noise like");
	}
}

class Cow extends Animal {
	public void animalSound() {
		System.out.println("A Cow say : Mooo");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("A Cat says : Meow");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myCow = new Cow();
		Animal myCat = new Cat();

		myAnimal.animalSound();
		myCow.animalSound();
		myCat.animalSound();
	}
}
