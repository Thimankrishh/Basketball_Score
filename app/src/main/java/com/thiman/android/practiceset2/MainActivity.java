package com.thiman.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int points = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE


    }
    public void start(View view){
        displayScore(points);
    }

    public void p1(View view){
        points = points + 1;
        displayScore(points);
    }

    public void p2(View view){
        points = points + 2;
        displayScore(points);
    }

    public void p3(View view){
         points = points + 3;
        displayScore(points);
    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */



    private void displayScore(int points) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(String.valueOf(points));
    }



    }





