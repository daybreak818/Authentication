package com.example.daybreak.authentication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class AuthService extends Service {
    public AuthService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public int onStartCommand(Intent intent, int flags, int startId) {
        // 该方法会持续运行直到服务已经被关闭
        // Toast为屏幕中下方要显示的提示框，你在UI一节的项目课中可以看到它的教程
        // 此处我们用Toast来向用户显示服务已经启动好了
        Toast.makeText(this, "Service status: started", Toast.LENGTH_LONG).show();

        return START_STICKY;
        // 这里的START_STICKY是onStartCommand(）方法的常量返回值
        // 指的是一个标志位，当service被中止后应该以哪种模式来启动
    }

    @Override
    public void onDestroy() {
        // 继承父类的onDestroy()方法
        super.onDestroy();

        Toast.makeText(this, "Service status: destroyed", Toast.LENGTH_LONG).show();
    }
}
