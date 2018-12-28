package design.zhaowd.结构.facade;

public abstract class IFacade {

	//对外提供这一个方法来写信，而不是提供写信的内容+写信皮 两个方法
	public static void writeLetter(String address, String name, String Cont) {
		//1.写信的内容
		write(Cont);
		//2.写信的皮
		write(address, name);
	}

	private static void write(String cont) {
		// TODO Auto-generated method stub
		
	}
	
	private static void write(String address, String name) {
		// TODO Auto-generated method stub
		
	}
}
