package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void goToPrev(View view){
        //Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        //startActivity(intent);

        finish(); //Go to home screen
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");

        TextView textView=findViewById(R.id.textView1);
        textView.setText("You have selected: "+ name);
    }
}