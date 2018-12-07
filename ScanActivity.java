package com.example.g00289111.farmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScanActivity extends AppCompatActivity {

    TextView tv,tv1,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.textView2);
        //tv3 = (TextView) findViewById(R.id.textView3);

        tv.setText(getIntent().getStringExtra("NAME"));
        tv1.setText(getIntent().getStringExtra("NAME2"));
        //tv3.setText(getIntent().getStringExtra("NAME3"));
    }
}
