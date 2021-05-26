package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView l1=findViewById(R.id.listView);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name= (String) adapterView.getItemAtPosition(i);
                Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}