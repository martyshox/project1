package com.example.g00289111.farmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Button crop = (Button) findViewById(R.id.crop);
        crop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), cropActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });


        Button feed = (Button) findViewById(R.id.feed);
        feed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), feedActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });

        Button dose = (Button) findViewById(R.id.dose);
        dose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), doseActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });

        Button weight = (Button) findViewById(R.id.weight);
        weight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), weightActivity.class);
                startActivityForResult(intent, 0);
                //return true;
            }
        });

    }
}
