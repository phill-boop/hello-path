package com.chaochaowu.runningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class instance extends AppCompatActivity {
    private long ins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance);
        ins=MainActivity.totalDistance;
        TextView distance=(TextView) findViewById(R.id.lucheng);
        distance.setText(Float.toString(ins)+"米");
    }
}