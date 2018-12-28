package design.zhaowd.create.build;

import java.util.ArrayList;
import java.util.List;

public class AsusComputer extends Build implements IComputer{

	
	@Override
	public IComputer createComputer() {
		List<String> list = new ArrayList<>();
		list.add("Key");
		list.add("mouse");
		Build build = new AsusComputer() ;
		build.createComputer(list);
		return null;
	}

	@Override
	public void createKeyBoart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createMouse() {
		// TODO Auto-generated method stub
		
	}


}
