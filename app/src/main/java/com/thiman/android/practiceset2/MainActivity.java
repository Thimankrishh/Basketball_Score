package com.thiman.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 int pointsTA = 0;
 int pointsTB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE


    }
    public void start(View view){
        displayScoreTA(0);
        displayScoreTB(0);
    }

    public void p1(View view){
        pointsTA = pointsTA + 1;
        displayScoreTA(pointsTA);
    }

    public void p2(View view){
        pointsTA = pointsTA + 2;
        displayScoreTA(pointsTA);
    }

    public void p3(View view){
        pointsTA = pointsTA + 3;
        displayScoreTA(pointsTA);
    }

    public void p1b(View view){
        pointsTB = pointsTB + 1;
        displayScoreTB(pointsTB);
    }

    public void p2b(View view){
        pointsTB = pointsTB + 2;
        displayScoreTB(pointsTB);
    }

    public void p3b(View view){
        pointsTB = pointsTB + 3;
        displayScoreTB(pointsTB);
    }
   public void reset(View view){
       pointsTA = 0;
       pointsTB = 0;
       displayScoreTA(0);
       displayScoreTB(0);
   }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */



    private void displayScoreTA(int points) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(String.valueOf(pointsTA));
    }

    private void displayScoreTB(int points) {
        TextView t = (TextView) findViewById(R.id.display_tBtext_view_2);
        t.setText(String.valueOf(pointsTB));
    }


    }





