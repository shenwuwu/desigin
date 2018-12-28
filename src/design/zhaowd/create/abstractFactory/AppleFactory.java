package design.zhaowd.create.abstractFactory;

import design.zhaowd.create.factoryMethod.IMackBook;
import design.zhaowd.create.factoryMethod.MacBookPro;
import design.zhaowd.create.factoryMethod.MacFactoryMethod;

public class AppleFactory implements AbstractFactory{

	@Override
	public IMackBook createPro() throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		return MacFactoryMethod.createMackBook(MacBookPro.class);
	}

	@Override
	public IMackBook createAir() {
		// TODO Auto-generated method stub
		return null;
	}

}
