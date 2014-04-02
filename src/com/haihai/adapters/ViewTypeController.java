package com.haihai.adapters;

import android.view.View;

public interface ViewTypeController {

	public void setID(int id);
	public int getID();
	/**
	 * Set the name of the type
	 * @param name
	 */
	public void setName(String name);

	/**
	 * Get the type name
	 * @return
	 */
	public String getName();
	
	/**
	 * Get a new view with the given data
	 * @param data
	 * @return
	 */
	public View getView();
	
	/**
	 * Set the content of the reused view with the given content
	 * @param data
	 */
	public void setView(View view);
	
	/**
	 * Clear the old data if you want to reuse a view with different data
	 */
	public void clear();
}
