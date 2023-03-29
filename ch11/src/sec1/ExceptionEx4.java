package sec1;

public class ExceptionEx4 {
	class Animal { }
	class Dog extends Animal { }
	class Cat extends Animal { }
	
	public static void main(String[] args) {
	//	Dog dog = new Dog();
		
	//	Cat cat = new Cat();
		
	}
	// 캐스팅 (형변환) 함수
	public static void changeDog(Animal animal){
		Dog dog = (Dog) animal;
		
	}
}