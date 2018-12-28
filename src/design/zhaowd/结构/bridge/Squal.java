package design.zhaowd.½á¹¹.bridge;

public class Squal extends Bridge{

	public Squal(IColor color) {
		super(color);
	}

	@Override
	public void draw() {
		color.draw("Ô²ÐÎ");
	}

}
