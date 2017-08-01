package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingProgress extends Activity {
    private ProgressBar lineProgress=null;
    private ProgressBar circleProgress=null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progressbar);
        lineProgress=(ProgressBar)findViewById(R.id.lineProgress);
        circleProgress=(ProgressBar)findViewById(R.id.circleProgress);
        lineProgress.setMax(100);
        lineProgress.setProgress(0);

    }

    @Override
    protected void onResume() {
        super.onResume();
        startTimer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTimer();
    }

    private int progress=0;

    private void startTimer(){
        if(timer==null){
            timer=new Timer();
            timertask=new TimerTask() {
                @Override
                public void run() {
                    progress++;
                    lineProgress.setProgress(progress);
                    if(progress>80){
                        progress=0;
                        stopTimer();
                    }
                }
            };
            timer.schedule(timertask,0,100);
        }
    }

    private void stopTimer(){
        if(timer!=null){
            timertask.cancel();
            timer.cancel();

            timer=null;
            timertask=null;
        }
    }

    private Timer timer=null;
    private TimerTask timertask=null;

}
