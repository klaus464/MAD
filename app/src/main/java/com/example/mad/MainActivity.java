package com.example.mad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("MAD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // To handle click without lambda (https://www.w3schools.com/java/java_lambda.asp)
        // This is how it is done in source files from faculty
        findViewById(R.id.btnWeek1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.mad.week01.MainActivity.class));
            }
        });
        */

        // Button to navigate to Week 01
        findViewById(R.id.btnWeek1).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week01.MainActivity.class)));

        // Button to navigate to Week 02
        findViewById(R.id.btnWeek2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week02.MainActivity.class)));

        // Button to navigate to Week 03
        findViewById(R.id.btnWeek3).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week03.MainActivity.class)));

        // Button to navigate to Week 04
        findViewById(R.id.btnWeek4).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week04.MainActivity.class)));

        // Button to navigate to Week 05
        findViewById(R.id.btnWeek5).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week05.MainActivity.class)));

        // Button to navigate to Week 06
        findViewById(R.id.btnWeek6).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week06.MainActivity.class)));

        // Button to navigate to Week 07
        findViewById(R.id.btnWeek7).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week07.MainActivity.class)));

        // Button to navigate to Week 08
        findViewById(R.id.btnWeek8).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week08.MainActivity.class)));

        // Button to navigate to Week 09
        findViewById(R.id.btnWeek9).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week09.MainActivity.class)));

        // Button to navigate to Week 10
        findViewById(R.id.btnWeek10).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week10.MainActivity.class)));

        // Button to navigate to Week 11
        findViewById(R.id.btnWeek11).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week11.MainActivity.class)));

        // Button to navigate to Week 12
        findViewById(R.id.btnWeek12).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week12.MainActivity.class)));

        // Button to navigate to Github Repository
        findViewById(R.id.btnGithubRepo).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/klaus464/MAD"))));

        // Button to navigate to Week 13
        findViewById(R.id.btnWeek13).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, com.example.mad.week13.MainActivity.class)));

        // Button to navigate to Github profile
        findViewById(R.id.btnGithubProfile).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/klaus464"))));
    }
}