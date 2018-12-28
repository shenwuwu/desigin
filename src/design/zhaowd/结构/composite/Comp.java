package design.zhaowd.½á¹¹.composite;

import java.util.List;

public class Comp implements ICont{
	List<ICont>  nextNode;
	List<ICont>  lastNode;
	
	public Comp(List<ICont>  nextNode, List<ICont>  lastNode) {
		super();
		this.nextNode = nextNode;
		this.lastNode = lastNode;
	}
	
	
}
