package com.example.logingreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class pantalla2 extends AppCompatActivity {
ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        ListView listView =(ListView)findViewById(R.id.listview);
        final ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("juan pere");
        arrayList.add("pedro sena");
        arrayList.add("jose luna ");
        arrayList.add("maria castillo");
        arrayList.add("mercedes castillo");
        arrayList.add("dario garcia");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(pantalla2.this,"mis estudiante:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}