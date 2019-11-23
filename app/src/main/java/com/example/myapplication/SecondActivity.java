package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle mbundle = getIntent().getExtras();

        if(mbundle != null){
            String name = mbundle.getString("name");
            Log.d("NAME", name);

        }

    }



}
