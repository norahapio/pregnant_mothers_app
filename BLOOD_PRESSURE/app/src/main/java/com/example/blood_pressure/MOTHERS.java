package com.example.blood_pressure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MOTHERS extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mothers);
        listView = (android.widget.ListView) findViewById(R.id.Dynamic);
        array = new ArrayList<>();
        array.add("apio");
        array.add("akol");
        array.add("itochu");
        array.add("shamira");
        array.add("fatuma");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked"+array.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MOTHERS.this, "App stoped", Toast.LENGTH_SHORT).show();
    }



}
