package design.zhaowd.create.abstractFactory;

import design.zhaowd.create.factoryMethod.IMackBook;

/**
 * 
 * �빤������ģʽ����ĽǶȲ�һ��
 * ��һ�� ��Ʒ    �ڶ��� ����/������    ��չ����ͬ�೧�̡�    ����������չ����ͬ���Ʒ
 * @author Administrator
 *
 */
public interface AbstractFactory {
	//
	IMackBook createPro() throws InstantiationException, IllegalAccessException;
	
	IMackBook createAir();
}
