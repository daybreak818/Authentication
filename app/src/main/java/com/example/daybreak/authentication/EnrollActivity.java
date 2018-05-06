package com.example.daybreak.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);
        Button button_finger = (Button) findViewById(R.id.button_finger);
        button_finger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //创建一个Intent从MainActivity跳转到EnrollActivity
                Intent intent = new Intent(EnrollActivity.this,FingerActivity.class);
                startActivity(intent);
            }
        });
        Button button_face = (Button) findViewById(R.id.button_face);
        button_face.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //创建一个Intent从MainActivity跳转到EnrollActivity
                Intent intent = new Intent(EnrollActivity.this,FaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
