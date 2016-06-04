package com.example.zhou.intentbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CatchDataActivity extends AppCompatActivity {

    private TextView mtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catch_data);

        mtv = (TextView) findViewById(R.id.my_tv);
        mtv.setText("catch data: "+this.getIntent().getSerializableExtra("serializable_obj"));
        MySerialClass obj= (MySerialClass) this.getIntent().getSerializableExtra("serializable_obj");
        Log.i("aqiu","catch data: "+obj);

    }
}
