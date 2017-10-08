package com.example.simpleadapterdemo;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

/**
 * Created by liuhe on 2017/10/8.
 */

public class ThirdActivity extends ListActivity {

    private String[] str = {"天明", "少羽", "鸣人", "佐助"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_expandable_list_item_1, str);

        setListAdapter(arrayAdapter);
    }
}
