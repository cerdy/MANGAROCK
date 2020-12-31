package com.example.mangareader.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.mangareader.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                //Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish ();
            }

        };

        new Handler().postDelayed(runnable, 2000);

    }
}