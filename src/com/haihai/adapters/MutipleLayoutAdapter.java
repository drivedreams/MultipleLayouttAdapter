package com.haihai.adapters;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MutipleLayoutAdapter extends BaseAdapter {
	List<ViewTypeController> rows = new ArrayList<ViewTypeController>();
	ViewTypeManager viewTypeManager = new ViewTypeManager();

	@Override
	public int getCount() {
		return viewTypeManager.getTypeCount();
	}

	@Override
	public Object getItem(int position) {
		return position;
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

		rows.get(position).getID();
		return super.getItemViewType(position);
	}

	@Override
	public int getViewTypeCount() {

		return viewTypeManager.getTypeCount();
	}
	
	private static class ItemHolder {
		View item;
		/**
		 * Used to remove the remained things.
		 */
		int position;
	}

}
