package com.example.quizapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startBtn = findViewById(R.id.btn_start);
        final TextView entName = findViewById(R.id.ent_name);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entName.length() == 0) {
                    Toast.makeText(MainActivity.this,
                            "Please enter you name",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent;
                    intent = new Intent(MainActivity.this, QuizQuestionsActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }
}