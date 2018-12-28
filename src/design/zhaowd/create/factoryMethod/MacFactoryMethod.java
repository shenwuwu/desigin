package design.zhaowd.create.factoryMethod;

public class MacFactoryMethod {
	
	
	public static <T> IMackBook createMackBook(Class<T> clazz) throws InstantiationException, IllegalAccessException {
		return (IMackBook) clazz.newInstance();
	}

}
