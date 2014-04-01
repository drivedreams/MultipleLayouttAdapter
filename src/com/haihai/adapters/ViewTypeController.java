package com.haihai.adapters;

import android.view.View;

public interface ViewTypeController {

	/**
	 * Set the name of the type
	 * @param name
	 */
	public void setName(String name);

	public String getName();
	
	/**
	 * Get a new view with the given data
	 * @param data
	 * @return
	 */
	public View getView(Object data);
	
	/**
	 * Set the content of the reused view
	 * @param data
	 */
	public void setView(Object data);
	
}
