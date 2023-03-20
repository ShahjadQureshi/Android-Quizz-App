package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Java was introduced in 1995?", "Java is built with JavaScript?",
    "Java support Multiple Inheritence?", "Java support Interfaces?", "Java has Abstract Classes?"};
    private boolean[] answers = {true, false, false, true, true};
    private int score = 0;
    Button Yes;
    Button No;
    TextView question;

    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.Yes);
        No = findViewById(R.id.No);
        question = findViewById(R.id.question);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<= questions.length-1) {
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;

                    if(index<= questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You're Score is: " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  if(index<= questions.length-1) {
                    if (answers[index] == false) {
                       score++;
                      }
                       index++;

                     if(index<= questions.length-1){
                         question.setText(questions[index]);
                       }
                     else{
                       Toast.makeText(MainActivity.this, "You're Score is: " + score, Toast.LENGTH_SHORT).show();
                        }
                     }
                 }
           });
    }
}