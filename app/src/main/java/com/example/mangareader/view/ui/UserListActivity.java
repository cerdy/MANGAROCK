package com.example.mangareader.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.mangareader.R;
import com.example.mangareader.view.ui.MainActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserListActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_listctivity);
        //getSupportActionBar().hide();

        //Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);

        textView = findViewById(R.id.textview);
        String emailfromIntent = getIntent().getStringExtra("EMAIL");
        textView.setText(emailfromIntent);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish ();
            }
        };
        new Handler().postDelayed(runnable, 2000);

    }
    
}