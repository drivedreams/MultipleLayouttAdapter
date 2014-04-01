package com.haihai.adapters;

import java.util.HashMap;
import java.util.Map;

import android.view.View;

public class ViewTypeManager {
 
	Map<String, ViewTypeController> types = new HashMap<String, ViewTypeController >();
	private static int typeCount = 0;
	/**
	 * 
	 * @param viewTypeController
	 */
	public void registViewType(ViewTypeController viewTypeController) {
		types.put(viewTypeController.getName(), viewTypeController);
		typeCount ++;
	}
	
	/**
	 * Get the count of the type
	 * @return
	 */
	public int getTypeCount(){
		return typeCount;
	}
	
	/**
	 * Get the given type view with the given data
	 * @param typeName
	 * @param data
	 * @return
	 */
	public View getTypeView(String typeName, Object data){
		return types.get(typeName).getView(data);
	}

}
