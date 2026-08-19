package com.weaglestudio.customlistviewspring23cslq1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        List<String> names=new ArrayList<>();
        names.add("waiz");
        names.add("ahmed");
        List<Integer> imgs=new ArrayList<>();
        imgs.add(R.drawable.ic_launcher_background);
        imgs.add(R.drawable.ic_launcher_foreground);

        ListView lv=findViewById(R.id.lv);
        MyListView mlv=new MyListView(this,names,imgs);
        lv.setAdapter(mlv);
    }
}