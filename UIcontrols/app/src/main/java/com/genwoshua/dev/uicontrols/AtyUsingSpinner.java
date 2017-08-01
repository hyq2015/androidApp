package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingSpinner extends Activity {
    private Spinner spinner=null;
    private ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_spinner);
        spinner=(Spinner)findViewById(R.id.spinner);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("选项1");
        adapter.add("选项2");
        adapter.add("选项3");
        adapter.add("选项4");
        spinner.setAdapter(adapter);
    }
}
