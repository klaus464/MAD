package com.example.mad.week01.b;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mad.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setTitle("MAD Week 1B");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week01b_activity_main);

        // Views
        TextView txtHelloUser = findViewById(R.id.txtHelloUser);
        EditText edtName = findViewById(R.id.edtName);
        Button btnOk = findViewById(R.id.btnOk);

        // Button Click Listener
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the name from the EditText
                String userName = edtName.getText().toString();

                // Display the hello message
                String helloMessage = "Hello, " + userName + "!";
                txtHelloUser.setText(helloMessage);
            }
        });
    }
}
