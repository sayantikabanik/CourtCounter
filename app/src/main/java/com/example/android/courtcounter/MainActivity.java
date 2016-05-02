package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointsA = 0;
    private int pointsB = 0;
    TextView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Updates Scores
    public void updateScore()
    {
        scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(pointsA));
        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(pointsB));
    }

    //Resets Scores
    public void reset (View v)
    {
        pointsA = 0;
        pointsB = 0;
        updateScore();
    }

    //on button click
    public void increment(View view){
        int id = view.getId();
        switch (id){
            case R.id.teamAInc3 :
                pointsA+=3;
                break;
            case R.id.teamADec2 :
                pointsA-=2;
                break;
            case R.id.teamAInc1 :
                pointsA++;
                break;
            case R.id.teamBInc3 :
                pointsB+=3;
                break;
            case R.id.teamBDec2 :
                pointsB-=2;
                break;
            case R.id.teamBInc1 :
                pointsB++;
                break;
        }
        updateScore();
    }


}
