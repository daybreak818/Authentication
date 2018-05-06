package com.example.daybreak.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate execute");
        //注册过程
        Button button_enroll = (Button) findViewById(R.id.button_enroll);
        button_enroll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //创建一个Intent从MainActivity跳转到EnrollActivity
                Intent intent = new Intent(MainActivity.this,EnrollActivity.class);
                startActivity(intent);
            }
        });
        //认证过程
        //认证服务构建
        Button button_authentication = (Button) findViewById(R.id.button_authentication);
        button_authentication.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
              onStartService(v);
            }
        });
    }
    //onStartService()方法用于启动服务
    public void onStartService(View v){
        //这里调用了startService()方法，需填入待启动服务的“意图”
        //创建的Intent对象中第二个参数即要指向的Service类
        startService(new Intent(getBaseContext(),AuthService.class));
    }

    //onStopService()方法用于停止服务
    public void onStopService(View v){
        //定义一个Intent对象来作为stopService()方法的参数
        stopService(new Intent(getBaseContext(),AuthService.class));
    }

    //主界面： 当Activity即将变得可见时会调用onStart()方法
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Authentication", "The function onStart() was called.");
    }

    // 当Activity已经变得可见时会调用onResume()方法
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Authentication", "The function onResume() was called.");
    }

    // 当其他的Activity已经获得了焦点时会调用onPause()方法
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Authentication", "The function onPause() was called.");
    }

    // 当Activity不再可见的时候会调用onStop()方法
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Authentication", "The function onStop() was called.");
    }

    // 当Activity被销毁的时候会调用onDestroy()方法
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Authentication", "The function onDestroy() was called.");
    }
}
