package com.example.a402;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button b1;
    private Object Button = (Button) findViewById(R.id.b1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ceckbox.class);
                view.getContext().startActivity((Intent) ceckbox);

                startActivity((Intent) ceckbox);
            }


        });


    }}



    
