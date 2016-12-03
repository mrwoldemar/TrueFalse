package com.example.student3.truefalse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TrueFalse tf = new TrueFalse();

    TrueFalse arr = {
            new TrueFalse("Вопрос 1", false),
            new TrueFalse("Вопрос 2",false),
            new TrueFalse("Вопрос 3",false),
            new TrueFalse("Вопрос 4",false),
            new TrueFalse("Вопрос 5",false)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e();
                Toast.makeText( MainActivity.this,
                        R.string.message,
                        Toast.LENGTH_SHORT).show();
            }
        });
        Yesbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e();
                Toast.makeText( MainActivity.this,
                        R.string.message,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }




}
