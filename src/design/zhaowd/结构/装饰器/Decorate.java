package design.zhaowd.�ṹ.װ����;

import design.zhaowd.�ṹ.ί��.IPeople;

public class Decorate implements IPeople{
	
	IPeople people;

	public Decorate(IPeople people) {
		super();
		this.people = people;
	}

	@Override
	public void marry() {
		
		people.marry();
		
	}

}
