package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.myBtn);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("MMM", "bytte sida");
                Intent second = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(second);
            }
        });
    }
}
