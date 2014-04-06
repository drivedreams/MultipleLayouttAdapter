package com.haihai.adapters;

import android.view.View;

public abstract class DefaultView implements ViewTypeController{

	
	/**
	 * The default value is -1. If you register it as a view type, it will be changed to a Integer value( > -1);
	 */
	private static int typeIndex = -1;
	
	/**
	 * Get a new view with the given data
	 * @param data
	 * @return
	 */
	abstract public View getView();
	
	/**
	 * Set the content of the reused view with the given content
	 * @param data
	 */
	abstract public void setView(View view);
	
	/**
	 * Clear the old data if you want to reuse a view with different data
	 */
	abstract public void clear();
	
	/**
	 * Fill the content of the will.
	 * @param obj
	 */
	abstract public void fillContent(Object obj);
	
	@Override
	public void setTypeID(int id) {
		typeIndex = id;
	}

	@Override
	public int getTypeID() {
		return typeIndex;
	}

}
