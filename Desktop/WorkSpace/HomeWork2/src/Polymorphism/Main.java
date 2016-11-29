package Polymorphism;

public class Main {

	public static void main(String [] args){
		Dog dog1 = new Hound();
		dog1.bark();
		Dog dog2= new Dog();
		dog2.bark();
		Dog dog3=new Dog();
		dog3.bark("Max");
		
	}
}
