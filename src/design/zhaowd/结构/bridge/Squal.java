package design.zhaowd.�ṹ.bridge;

public class Squal extends Bridge{

	public Squal(IColor color) {
		super(color);
	}

	@Override
	public void draw() {
		color.draw("Բ��");
	}

}
