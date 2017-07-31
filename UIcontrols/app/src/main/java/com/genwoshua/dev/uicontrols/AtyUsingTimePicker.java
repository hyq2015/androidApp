package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by Administrator on 2017/7/31.
 */

public class AtyUsingTimePicker extends Activity {
    private Button timeBtn=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_timepicker);

        timeBtn=(Button)findViewById(R.id.timeBtn);
        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        timeBtn.setText(String.format("%s:%s",toDouble(hourOfDay),toDouble(minute)));
                    }
                },10,25,true).show();
            }
        });
    }
    private String toDouble(int txt){
        return txt>=10 ? ""+txt : "0"+txt;
    }
}
