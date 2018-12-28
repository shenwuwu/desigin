package design.zhaowd.½á¹¹.composite;

import java.util.List;

public class Header implements ICont{
	List<ICont> nextNode;

	public Header(List<ICont> nextNode) {
		super();
		this.nextNode = nextNode;
	}
	
}
