package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingSeekbar extends Activity {
    private SeekBar seekBar=null;
    private TextView showTxt=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_seekbar);

        seekBar=(SeekBar)findViewById(R.id.seekBar);
        showTxt=(TextView)findViewById(R.id.seekText);

        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showTxt.setText(String.format("进度:%d",progress)+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
