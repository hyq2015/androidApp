package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingProgressDialog extends Activity {
    private Button btn =null;
    private ProgressDialog pd=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progressdialog);
        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd=ProgressDialog.show(AtyUsingProgressDialog.this,"提示","正在加载,请稍后");

                new Thread(){
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            pd.dismiss();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        });
    }
}
