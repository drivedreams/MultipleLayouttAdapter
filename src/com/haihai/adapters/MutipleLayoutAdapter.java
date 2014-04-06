package com.haihai.adapters;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MutipleLayoutAdapter extends BaseAdapter {
	List<DefaultView> rows = new ArrayList<DefaultView>();

	public MutipleLayoutAdapter(List<DefaultView> rows) {
		super();
		this.rows = rows;
	}

	@Override
	public int getCount() {
		return rows.size();
	}

	@Override
	public Object getItem(int position) {
		return rows.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ItemHolder itemHolder;
		if (convertView == null) {
			itemHolder = new ItemHolder();
			itemHolder.item = rows.get(position).getView();
		} else {
			itemHolder = (ItemHolder) convertView.getTag();
			if(itemHolder.position != position){
				rows.get(position).clear();
			}
			rows.get(position).setView(itemHolder.item);
		}
		itemHolder.item.setTag(itemHolder);
		return itemHolder.item;
	}

	@Override
	public int getItemViewType(int position) {

		return rows.get(position).getTypeID();
	}

	@Override
	public int getViewTypeCount() {

		return ViewTypeManager.getTypeCount();
	}
	
	/**
	 * 
	 * @author zhanghaihai (drivedreams@163.com)
	 *
	 */
	private static class ItemHolder {
		View item;
		/**
		 * Used to remove the remained things.
		 */
		int position;
	}
	
	/**
	 * You should use this method to ad a new row to the adapter. 
	 * It will register the view as a type to the view manager, if it has not been register.
	 * @param view
	 */
	public void addRow(DefaultView row){
		ViewTypeManager.registerViewType(row);
		rows.add(row);
	}
	 
}
