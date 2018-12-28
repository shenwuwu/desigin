package design.zhaowd.action.mediator;

public class Mediator {
	ClassA a;
	ClassB b;
	
	public Mediator(ClassA a, ClassB b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void printB() {
		b.print();
	}
	
	public void printA() {
		a.print();
	}
	
}
