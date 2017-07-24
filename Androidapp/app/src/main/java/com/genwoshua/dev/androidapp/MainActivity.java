package com.genwoshua.dev.androidapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private int num1=0;
    private int num2=0;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getNumber();
    }
    public void getNumber(){
        Button LeftBtn=(Button) findViewById(R.id.button);
        Button RightBtn=(Button) findViewById(R.id.button2);
        Random randomNumber=new Random();
        while (num1 == num2){
            num1=randomNumber.nextInt(10);
            num2=randomNumber.nextInt(10);
        }
        System.out.println("number1: "+num1+" number2: "+num2);
        LeftBtn.setText(""+num1);
        RightBtn.setText(""+num2);
    }
    public void LeftBtnClick(View view) {
        Button LeftBtn=(Button) findViewById(R.id.button);
        if(num1>num2){
            Toast.makeText(this,"选择正确",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"选择错误",Toast.LENGTH_SHORT).show();
        }

    }

    public void RightBtnClick(View view) {
        Button RightBtn=(Button) findViewById(R.id.button2);
        if(num2>num1){
            Toast.makeText(this,"选择正确",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"选择错误",Toast.LENGTH_SHORT).show();
        }

    }

    public void generateRandomNumber(View view){
        num1=0;
        num2=0;
        getNumber();
    }
}
