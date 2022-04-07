package com.learnoset.offlinequizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_activity);

        final Button startBtn = findViewById(R.id.button2);
        EditText name = (EditText) findViewById(R.id.name);

        String PlayerName = name.getText().toString();


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String selectedTopicName ='java';

                    // Create an Object of Intent to open quiz questions screen
                    final Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    intent.putExtra("Player_Name", PlayerName); //passing information to next activity

                    // call startActivity to open next activity along with data(userName, selectedTopicName)
                    startActivity(intent);

                    finish(); // finish (destroy) this activity

            }
        });
    }
}