package design.zhaowd.�ṹ.composite;

import java.util.List;

public class Footer implements ICont{
	List<ICont>  lastNode;

	public Footer(List<ICont> lastNode) {
		super();
		this.lastNode = lastNode;
	}

	
	
	
}
