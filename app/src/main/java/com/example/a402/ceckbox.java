package com.example.a402;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ceckbox extends AppCompatActivity {

Button b2;
    private Object visit;
    private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceckbox);
       
        Button = (Button) findViewById(R.id.b2);

        Button.setOnClickListener(new View.OnClickListener() {
            private Object ceckbox;

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), visit.class);
                view.getContext().startActivity((Intent) visit);

                startActivity((Intent) visit);
            }


        });


    }}



