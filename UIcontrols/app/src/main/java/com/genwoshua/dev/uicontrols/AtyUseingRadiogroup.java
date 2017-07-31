package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/7/31.
 */

public class AtyUseingRadiogroup extends Activity {
    private RadioButton radioCorrectBtn=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_usingradiogroup);
        radioCorrectBtn=(RadioButton)findViewById(R.id.rightBtn);
        findViewById(R.id.submitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioCorrectBtn.isChecked()){
                    new AlertDialog.Builder(AtyUseingRadiogroup.this).setTitle("判断").setMessage("回答正确").setPositiveButton("关闭", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                }else{
                    new AlertDialog.Builder(AtyUseingRadiogroup.this).setTitle("判断").setMessage("回答错误").setPositiveButton("关闭", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                }
            }
        });
    }
}
