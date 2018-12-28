package design.zhaowd.½á¹¹.Î¯ÅÉ;

public class Delegate {
	IPeople people;

	public Delegate(IPeople people) {
		super();
		this.people = people;
	}
	
	public void ³Ô·¹() {
		people.marry();
	}
}
