package com.example.g00289111.farmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button farmEvent = (Button) findViewById(R.id.farmEvent);
        farmEvent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), eventActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });

        Button weatherEvent = (Button) findViewById(R.id.weatherEvent);
        weatherEvent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), weatherActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });
    }
}
