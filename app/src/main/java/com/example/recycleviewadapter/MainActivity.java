package com.example.recycleviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] city = {"Surat","Bhavnagar","Botad","Anand","Surat","Bhavnagar","Botad","Anand","Surat","Bhavnagar","Botad","Anand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c1 = new CustomAdapter(city);
        recyclerView.setAdapter(c1);
    }
}