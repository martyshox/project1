package com.example.g00289111.farmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class doseActivity extends AppCompatActivity {

    EditText doseName,doseAmount,calenderView;
    Button scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dose);
        
        doseName = (EditText) findViewById(R.id.doseName);
        doseAmount = (EditText) findViewById(R.id.doseAmount);
        //calenderView = (EditText) findViewById(R.id.calendarView2);

        scan = (Button) findViewById(R.id.scan);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namevalue = doseName.getText().toString();
                String namevalue2 = doseAmount.getText().toString();
                //String namevalue3 = calenderView.getText().toString();
                Intent intent = new Intent(v.getContext(), ScanActivity.class);
                intent.putExtra("NAME" , namevalue);
                intent.putExtra("NAME2" , namevalue2);
                //intent.putExtra("NAME2" , namevalue3);
                startActivityForResult(intent, 0);
            }
        });

    }
}
