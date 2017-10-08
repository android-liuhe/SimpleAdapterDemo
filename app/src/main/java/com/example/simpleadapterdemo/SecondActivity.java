package com.example.simpleadapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by liuhe on 2017/10/8.
 */

public class SecondActivity extends Activity {

    private ListView listView;
    private String[] str = {"小杰", "奇犽", "路飞", "索隆"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1, str);
        listView.setAdapter(arrayAdapter);
    }
}
