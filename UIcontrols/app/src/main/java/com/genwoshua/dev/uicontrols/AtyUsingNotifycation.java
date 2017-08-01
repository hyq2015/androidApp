package com.genwoshua.dev.uicontrols;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/8/1.
 */

public class AtyUsingNotifycation extends Activity {
    private Button showNty=null;
    private NotificationManager nf;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_notifycation);
        showNty=(Button)findViewById(R.id.showNty);

        nf=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nf.cancel(R.layout.aty_using_notifycation);
        showNty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Notification builder=new Notification(R.drawable.cartoon1,"ticker txt",System.currentTimeMillis());
//                builder.setLatestEventInfo(AtyUsingNotifycation.this,"title","content",PendingIntent.getActivity(AtyUsingNotifycation.this,1,getIntent(),0));

//                builder.setContentIntent(PendingIntent.getActivity(AtyUsingNotifycation.this,1,getIntent(),0));
//                Notification n=new Notification(R.drawable.cartoon1,"ticker txt",System.currentTimeMillis());


                NotificationCompat.Builder builder = new NotificationCompat.Builder(AtyUsingNotifycation.this);
                builder.setSmallIcon(R.mipmap.wechat);
                builder.setContentIntent(PendingIntent.getActivity(AtyUsingNotifycation.this,1,getIntent(),0));
                builder.setWhen(System.currentTimeMillis());
                builder.setContentTitle("习主席");
                builder.setContentText("同志们辛苦了");
                builder.setTicker("状态栏上显示");
                builder.setAutoCancel(true);
                nf.notify(R.layout.aty_using_notifycation,builder.build());
            }
        });
    }
}
