package design.zhaowd.结构.装饰器;

import design.zhaowd.结构.委派.IPeople;

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
