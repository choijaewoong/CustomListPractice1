package com.example.androidchoi.customlistpractice1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Choi on 2015-10-09.
 */
public class MyAdapter extends BaseAdapter {

    List<ItemData> items = new ArrayList<ItemData>();

    public void add(ItemData item){
        items.add(item);
        notifyDataSetChanged(); //데이터 변경을 알림
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView view;
        if(convertView == null){
            view = new ItemView(parent.getContext());
        }else{
            view = (ItemView)convertView;
        }
        view.setItemData(items.get(position));
        return view;
    }
}
