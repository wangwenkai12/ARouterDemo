package com.example.arouterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.LoginActivity;
import com.example.member.ActivityUtil;

public class MainActivity extends AppCompatActivity {

    private Button mMainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityUtil activityUtil = new ActivityUtil();
        activityUtil.putActivity();

        mMainBtn = findViewById(R.id.main_button);
        mMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}
