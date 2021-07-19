package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		System.out.println("������ �Խ��ϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void fly() {
		System.out.println("�������� ������ ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		/*
		for(Animal animal : animalList) {
			animal.move();
		}
		
		for(int i = 0; i < animalList.size(); i++) {
			Animal str = animalList.get(i);
			str.move();
		
		}
		 */
		AnimalTest test = new AnimalTest();
		test.testDownCating(animalList);
	}
	
	public void testDownCating(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.fly();
			} else {
				System.out.println("ERROR!!!!");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		System.out.println("sss");
	}
}
