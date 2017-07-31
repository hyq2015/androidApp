package com.genwoshua.dev.uicontrols;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new ArrayAdapter<ListCellData>(this,android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        adapter.add(new ListCellData(this,"Radiogroup",new Intent(this,AtyUseingRadiogroup.class)));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        ListCellData data=adapter.getItem(position);
        data.StartActivity();
        super.onListItemClick(l, v, position, id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
