package design.zhaowd.create.abstractFactory;

import design.zhaowd.create.factoryMethod.IMackBook;

/**
 * 
 * 与工厂方法模式抽象的角度不一样
 * 第一层 产品    第二层 厂商/工厂；    扩展的是同类厂商。    工厂方法扩展的是同类产品
 * @author Administrator
 *
 */
public interface AbstractFactory {
	//
	IMackBook createPro() throws InstantiationException, IllegalAccessException;
	
	IMackBook createAir();
}
