package com.genwoshua.dev.uselistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
/**
 * Created by Administrator on 2017/7/31.
 */

public class CustomListViewAdapter extends BaseAdapter {
    private Context context = null;

    public CustomListViewAdapter(Context context) {
        this.context = context;
    };

    public Context getContext() {
        return context;
    };

    private CustomListCellData[] data = new CustomListCellData[]{
            new CustomListCellData("img1", "图片1", R.drawable.cartoon1),
            new CustomListCellData("img2", "图片2", R.drawable.cartoon2),
            new CustomListCellData("img3", "图片3", R.drawable.cartoon3),
    };

    // private String[] data=new String[]{"ricky1","ricky2","ricky3","ricky4","ricky5","ricky6","ricky7","ricky8","ricky9","ricky10","ricky11","ricky12","ricky13","ricky14"};
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public CustomListCellData getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout ll = null;
        if (convertView != null) {
            ll = (LinearLayout) convertView;
        } else {
            ll = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.custom_listcell, null);
        }

        CustomListCellData data = getItem(position);
        ImageView icon = (ImageView) ll.findViewById(R.id.icon);
        TextView name = (TextView) ll.findViewById(R.id.name);
        TextView desc = (TextView) ll.findViewById(R.id.desc);

        icon.setImageResource(data.iconid);
        name.setText(data.name);
        desc.setText(data.desc);
        return ll;
//            TextView tv=null;
//            if(convertView!=null){
//                tv=(TextView) convertView;
//            }else{
//                System.out.println("22222");
//                tv=new TextView(CustomListView.this);
//            }
//            tv.setTextSize(40);
//            tv.setText(getItem(position));
//
//            return tv;
    }
}
