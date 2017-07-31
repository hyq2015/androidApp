package com.genwoshua.dev.uselistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2017/7/31.
 */

public class CustomListViewActivity extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listviewaty);
        setListAdapter(new CustomListViewAdapter(this));
    }
}
