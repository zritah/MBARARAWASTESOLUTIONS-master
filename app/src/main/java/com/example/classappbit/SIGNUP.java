package com.example.classappbit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ann.classappbit2.R;

public class SIGNUP extends AppCompatActivity {
    Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mybutton=findViewById(R.id.button3);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent1 =new Intent(SIGNUP.this,SIGNIN.class);
                startActivity(myintent1);
            }
        });
    }
}
