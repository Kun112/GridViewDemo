package com.example.anhquan.gridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Anh Quan on 8/2/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private Integer[] arr;

    public MyAdapter(Context c, Integer[] a)
    {
        context = c;
        arr = a;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img;
        if(convertView == null)
        {
            img = new ImageView(context);
            img.setLayoutParams(new GridView.LayoutParams(200, 200));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8, 8, 8, 8);
        }
        else
        {
            img = (ImageView)convertView;
        }
        img.setImageResource(arr[position]);
        return img;
    }


}
