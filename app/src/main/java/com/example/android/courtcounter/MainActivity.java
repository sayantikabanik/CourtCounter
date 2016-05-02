package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score ) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void incBy3 (View v)
    {
       points+=3;
        displayForTeamA( points);
       // displayForTeamB(points);
    }
    public void decBy3 (View v)
    {
        points-=2;
        displayForTeamA( points);
        //displayForTeamB(points);
    }
    public void incBy1 (View v)
    {
        points+=1;
        displayForTeamA( points);
       // displayForTeamA(points);
    }
    public void inccBy3 (View v)
    {
        points+=3;
        //displayForTeamA( points);
         displayForTeamB(points);
    }
    public void deccBy3 (View v)
    {
        points-=2;
        //displayForTeamA( points);
        displayForTeamB(points);
    }
    public void inccBy1 (View v)
    {
        points+=1;
        //displayForTeam( points);
         displayForTeamB(points);
    }
    public void reset (View v)
    {
        points=0;
        //displayForTeam( points);
        displayForTeamB(points);
        displayForTeamA(points);
    }


}
