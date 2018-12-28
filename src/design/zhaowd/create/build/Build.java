package design.zhaowd.create.build;

import java.util.List;

public abstract class Build {
	
	public final void createComputer(List<String> list) {
		for(String str : list) {
			if("Key".equals(str)) {
				createKeyBoart();
			}else {
				createMouse();
			}
		}
	};
	
	public abstract void createKeyBoart();
	public abstract void createMouse();
	
}
