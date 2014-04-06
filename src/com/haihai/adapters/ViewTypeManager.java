package com.haihai.adapters;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

public class ViewTypeManager {
 
	private static List<ViewTypeController> types = new ArrayList< ViewTypeController >();
	private static int nextIndex =0;
	private static int typeCount = 0;
	
	/**
	 * Gets the index of the new type when register a new type.
	 * @return
	 */
	public static int  getNextTypeIndex(){
		return nextIndex;
	}
	
	/**
	 * Register the given type of view. 
	 * If the given controller (Type ID > -1), it will be registered. 
	 * @param viewTypeController
	 */
	public static void registerViewType(ViewTypeController controller) {
		if(controller.getTypeID() == -1){
			controller.setTypeID(types.size()-1);
			types.add(controller);
			typeCount = types.size();
			nextIndex = types.size();
		}else{
			Log.w("ViewTypeManager", "This type of view has already been registed !");
		}
	}
	
	/**
	 * Get the count of the type
	 * @return
	 */
	public static int getTypeCount(){
		return typeCount;
	}

}
