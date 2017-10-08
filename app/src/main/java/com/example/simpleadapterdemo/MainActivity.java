package com.example.simpleadapterdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by liuhe on 2017/10/8.
 */

public class MainActivity extends Activity implements OnClickListener{

    private Button second, third, four;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        second = (Button) findViewById(R.id.second);
        third = (Button) findViewById(R.id.third);
        four = (Button) findViewById(R.id.four);

        second.setOnClickListener(this);
        third.setOnClickListener(this);
        four.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.second:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.third:
                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                break;
            case R.id.four:
                Intent intent3 = new Intent(this, FourActivity.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }
}
