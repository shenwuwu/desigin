package design.zhaowd.�ṹ.ί��;

public class Delegate {
	IPeople people;

	public Delegate(IPeople people) {
		super();
		this.people = people;
	}
	
	public void �Է�() {
		people.marry();
	}
}
