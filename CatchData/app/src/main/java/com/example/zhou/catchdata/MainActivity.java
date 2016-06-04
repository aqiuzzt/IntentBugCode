package com.example.zhou.catchdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv = (TextView) findViewById(R.id.my_tv);
//        mtv.setText("catch data: "+this.getIntent().getSerializableExtra("serializable_obj"));
       // Log.i("aqiu","catch data: "+this.getIntent().getStringExtra("serializable_obj"));
        Log.i("aqiu","catch data: "+this.getIntent().getSerializableExtra("serializable_obj"));

    }
}
