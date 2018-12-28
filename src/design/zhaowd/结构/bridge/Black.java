package design.zhaowd.结构.bridge;

public class Black implements IColor{


	@Override
	public void draw(String shap) {
		System.out.println("黑色的：" + shap);
		
	}

}
