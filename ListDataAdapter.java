package com.example.haasikapuram.dontpanic;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haasikapuram on 19/06/17.
 */

public class ListDataAdapter extends ArrayAdapter {
    List list=new ArrayList();
    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler{
        TextView NAME,MOB;

    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        LayoutHandler layoutHandler;
        if(row==null){
            LayoutInflater layoutInflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.row_layout,parent,false);
            layoutHandler=new LayoutHandler();
            layoutHandler.NAME=(TextView) row.findViewById(R.id.text_user_name);
            layoutHandler.MOB=(TextView) row.findViewById(R.id.text_user_mobile);
            row.setTag(layoutHandler);
        }
        else{
            layoutHandler=(LayoutHandler)row.getTag();
        }
        DataProvider dataProvider=(DataProvider)this.getItem(position);
        layoutHandler.NAME.setText(dataProvider.getName());
        layoutHandler.MOB.setText(dataProvider.getMob());
        return row;
    }
}
