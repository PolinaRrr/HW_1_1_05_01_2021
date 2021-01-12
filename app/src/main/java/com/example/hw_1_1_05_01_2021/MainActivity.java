package com.example.hw_1_1_05_01_2021;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    Button button_next_page1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_next_page1 = findViewById(R.id.button_next_page1);


        button_next_page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page_second = new Intent(MainActivity.this, PageSecond.class);
                startActivity(page_second);
            }
        });

    }
}

