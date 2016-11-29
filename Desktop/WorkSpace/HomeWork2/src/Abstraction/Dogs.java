package Abstraction;

public abstract class Dogs implements Mammals{
	public void legs(){
		System.out.println("Mammals have four legs");
	}
	
	void bark(){
		System.out.println("Dogs can bark");
	}
	abstract void breed();
}
