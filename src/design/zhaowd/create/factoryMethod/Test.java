package design.zhaowd.create.factoryMethod;

public class Test {
	
	public static void main(String[] args) {
		try {
			IMackBook macBook = MacFactoryMethod.createMackBook(MacBookPro.class);
			macBook.build();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
