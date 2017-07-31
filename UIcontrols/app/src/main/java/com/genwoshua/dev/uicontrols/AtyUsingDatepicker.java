package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

/**
 * Created by Administrator on 2017/7/31.
 */

public class AtyUsingDatepicker extends Activity {
    private Button btnSelectDate=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_datepicker);
        btnSelectDate=(Button)findViewById(R.id.btnSelectDate);
        btnSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DatePickerDialog(AtyUsingDatepicker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        btnSelectDate.setText(String.format("%s-%s-%s",toDouble(year),toDouble(month),toDouble(dayOfMonth)));
                    }
                },2017,7,31).show();
            }
        });
    }
    private String toDouble(int txt){
        return txt>=10 ? ""+txt : "0"+txt;
    }
}
