package com.haihai.adapters;

import java.util.ArrayList;
import java.util.List;

public class ViewTypeManager {
 
	List<ViewTypeController> types = new ArrayList< ViewTypeController >();
	private static int typeCount = 0;
	/**
	 * 
	 * @param viewTypeController
	 */
	public void registViewType(ViewTypeController viewTypeController) {
		viewTypeController.setID(types.size()-1);
		types.add(viewTypeController);
		typeCount = types.size();
	}
	
	/**
	 * Get the count of the type
	 * @return
	 */
	public int getTypeCount(){
		return typeCount;
	}
	
	

}
