package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.myBtn);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("MMM", "new activity");
                Intent second = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(second);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        myPreferenceRef = getSharedPreferences("MyPreferenceName", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();
        TextView prefTextRef=new TextView(this);
        Log.d("VVV", ""+myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));
        prefTextRef=(TextView)findViewById(R.id.prefText);
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));
    }
}
