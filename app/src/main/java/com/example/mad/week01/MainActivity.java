package com.example.mad.week01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mad.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("MAD Week 1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week01_activity_main);

        // Button to navigate to Week 1A
        findViewById(R.id.btnA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.mad.week01.a.MainActivity.class));
            }
        });

        // Button to navigate to Week 1B
        findViewById(R.id.btnB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.mad.week01.b.MainActivity.class));
            }
        });
    }
}