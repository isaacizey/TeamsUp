package com.example.android.teams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int teamAScore=0;
    int teamBScore=0;


    public  void addTeamB1(View v)
    {
        teamBScore=teamBScore+1;
        displayForTeamB(teamBScore);
    }
    public  void addTeamB2(View v)
    {
        teamBScore=teamBScore+2;
        displayForTeamB(teamBScore);
    }
    public  void addTeamB3(View v)
    {
        teamBScore=teamBScore+3;
        displayForTeamB(teamBScore);
    }

    public  void addTeamA1(View v)
    {
        teamAScore=teamAScore+1;
        displayForTeamA(teamAScore);
    }

    public  void addTeamA2(View v)
    {
        teamAScore=teamAScore+2;
        displayForTeamA(teamAScore);
    }
    public  void addTeamA3(View v)
    {
        teamAScore=teamAScore+3;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamA(int score)
    {
        TextView teamAScoreDisplay=(TextView)findViewById(R.id.teamAScoreDisplay);
        teamAScoreDisplay.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score)
    {
        TextView teamBScoreDisplay=(TextView)findViewById(R.id.teamBScoreDisplay);
        teamBScoreDisplay.setText(String.valueOf(score));
    }

    public void resetScore(View v)
    {
        teamAScore=0;
        teamBScore=0;
        displayForTeamB(teamBScore);
        displayForTeamA(teamAScore);
    }
}
