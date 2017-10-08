package com.example.simpleadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourActivity extends AppCompatActivity {

    private ListView listView;
    private String[] names = new String[]{"小明", "小白", "小黑", "小李"};
    private String[] descs = new String[]{"中二的小少年", "中二的小白脸",
            "文艺的小黑脸", "文艺好青年小李"};
    private int[] images = new int[]{R.mipmap.image1, R.mipmap.image2,
            R.mipmap.image3, R.mipmap.image4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        listView = (ListView) findViewById(R.id.listview);

        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            Map<String, Object> map = new HashMap<>();
            map.put("header", images[i]);
            map.put("personName", names[i]);
            map.put("dess", descs[i]);
            list.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.item,
                new String[]{"header", "personName", "dess"},
                new int[]{R.id.head, R.id.name, R.id.desc});
        listView.setAdapter(adapter);

    }
}
