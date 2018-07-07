package Inhertance;

public class Bird extends Animal {
	Bird() {
		super();
	}
	public void fly() {
		System.out.println("I am flying");
	}
	public void sing() {
		System.out.println("I am singing");
	}

public static void main(String args[]) {
	Bird brd = new Bird();
	brd.fly();
	brd.walk();
	brd.sing();
	}
}