package design.zhaowd.½á¹¹.bridge;

public abstract class Bridge {
	IColor color;

	public Bridge(IColor color) {
		super();
		this.color = color;
	}
	
	public abstract void draw();
}
