package com.genwoshua.dev.uselistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView Lv;
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lv=(ListView) findViewById(R.id.listView);

        adapter=new ArrayAdapter<ListCellData>(this,android.R.layout.simple_list_item_1);//采用系统提供的列表项
//        adapter=new ArrayAdapter<ListCellData>(this,R.layout.list_cell);//采用自定义的列表项

        Lv.setAdapter(adapter);
//        adapter.add("hello");
//        adapter.add("ricky");
        adapter.add(new ListCellData("小明","男",17));
        adapter.add(new ListCellData("小黄","男",20));
        adapter.add(new ListCellData("小曼","女",20));

        Lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListCellData data= adapter.getItem(position);
        Toast.makeText(this,String.format("名字: %s,性别:%s,年龄:%d",data.getUserName(),data.getSex(),data.getAge()),Toast.LENGTH_LONG).show();
    }
}
