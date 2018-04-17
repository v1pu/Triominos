package com.example.vipu.triominos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score1=0;
int score2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add0for1(View view)
    {
        score1=score1+0;
        displayFor1(score1);
    }
    public void add1for1(View view)
    {
        score1=score1+1;
        displayFor1(score1);
    }
    public void add2for1(View view)
    {
        score1=score1+2;
        displayFor1(score1);
    }
    public void add3for1(View view)
    {
        score1=score1+3;
        displayFor1(score1);
    }
    public void add4for1(View view)
    {
        score1=score1+4;
        displayFor1(score1);
    }
    public void add5for1(View view)
    {
        score1=score1+5;
        displayFor1(score1);
    }
    public void add10for1(View view)
    {
        score1=score1+10;
        displayFor1(score1);
    }
    public void add40for1(View view)
    {
        score1=score1+40;
        displayFor1(score1);
    }
    public void add50for1(View view)
    {
        score1=score1+50;
        displayFor1(score1);
    }
    public void sub5for1(View view)
    {
        score1=score1-5;
        displayFor1(score1);
    }
    public void sub10for1(View view)
    {
        score1=score1-10;
        displayFor1(score1);
    }
    public void displayFor1(int score)
    {
        TextView scoreView=(TextView)findViewById(R.id.display_player1);
        scoreView.setText(String.valueOf(score1));
    }
    public void displayFor2(int score)
    {
        TextView scoreView=(TextView)findViewById(R.id.display_player2);
        scoreView.setText(String.valueOf(score2));
    }

    public void add0for2(View view)
    {
        score2=score2+0;
        displayFor2(score2);
    }
    public void add1for2(View view)
    {
        score2=score2+1;
        displayFor2(score2);
    }
    public void add2for2(View view)
    {
        score2=score2+2;
        displayFor2(score2);
    }
    public void add3for2(View view)
    {
        score2=score2+3;
        displayFor2(score2);
    }
    public void add4for2(View view)
    {
        score2=score2+4;
        displayFor2(score2);
    }
    public void add5for2(View view)
    {
        score2=score2+5;
        displayFor2(score2);
    }
    public void add10for2(View view)
    {
        score2=score2+10;
        displayFor2(score2);
    }
    public void add40for2(View view)
    {
        score2=score2+40;
        displayFor2(score2);
    }
    public void add50for2(View view)
    {
        score2=score2+50;
        displayFor2(score2);
    }
    public void sub5for2(View view)
    {
        score2=score2-5;
        displayFor2(score2);
    }
    public void sub10for2(View view)
    {
        score2=score2-10;
        displayFor2(score2);
    }
    public void resetScore(View view)
    {
        score1=0;
        score2=0;
        displayFor1(score1);
        displayFor2(score2);
    }
}
