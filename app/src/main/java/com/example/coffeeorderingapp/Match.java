package com.example.coffeeorderingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Match extends AppCompatActivity {



    int scoreForRed =0;
    int scoreForBlue =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match);

        Button buttonRed2 = (Button) findViewById(R.id.twoPointRed);
        Button buttonRed3 = (Button) findViewById(R.id.threePointRed);
        Button buttonRedfree = (Button) findViewById(R.id.freeHandPointRed);

        Button buttonBlue2 = (Button) findViewById(R.id.twoPointBlue);
        Button buttonBlue3 = (Button) findViewById(R.id.threePointBlue);
        Button buttonBluefree = (Button) findViewById(R.id.freeHandPointBlue);

        Button resetButton = (Button) findViewById(R.id.reset);


        buttonRed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForRed +=2;
                displayForTeamA(scoreForRed);
                Toast toast= Toast.makeText(getApplicationContext(), "Two Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonRed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForRed +=3;
                displayForTeamA(scoreForRed);
                Toast toast= Toast.makeText(getApplicationContext(), "Three Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonRedfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForRed +=5;
                displayForTeamA(scoreForRed);
                Toast toast= Toast.makeText(getApplicationContext(), "Five Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonBlue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForBlue +=2;
                displayForTeamB(scoreForBlue);
                Toast toast= Toast.makeText(getApplicationContext(), "Two Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonBlue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForBlue +=3;
                displayForTeamB(scoreForBlue);
                Toast toast= Toast.makeText(getApplicationContext(), "Three Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buttonBluefree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreForBlue +=5;
                displayForTeamB(scoreForBlue);
                Toast toast= Toast.makeText(getApplicationContext(), "Five Points Added",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayForTeamA(0);
                displayForTeamB(0);
                scoreForRed =0;
                scoreForBlue =0;
            }
        });
    }



    public void displayForTeamA(int score)
    {
        TextView scoreForA =(TextView) findViewById(R.id.teamRedPoints);
        scoreForA.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score)
    {
        TextView scoreForB = (TextView) findViewById(R.id.teamBluePoints);
        scoreForB.setText(String.valueOf(score));

    }


}