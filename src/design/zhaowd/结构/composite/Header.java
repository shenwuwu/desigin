package design.zhaowd.�ṹ.composite;

import java.util.List;

public class Header implements ICont{
	List<ICont> nextNode;

	public Header(List<ICont> nextNode) {
		super();
		this.nextNode = nextNode;
	}
	
}
