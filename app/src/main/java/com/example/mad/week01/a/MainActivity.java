package com.example.mad.week01.a;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mad.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("MAD Week 1A");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week01a_activity_main);

        // TextView with the id txtHelloUser in your activity_week1a_main.xml layout
        TextView txtHelloUser = findViewById(R.id.txtHelloUser);

        // We'll use a hardcoded name for now
        String userName = "John";

        // Display the hello message
        String helloMessage = "Hello, " + userName + "!";
        txtHelloUser.setText(helloMessage);
    }
}
