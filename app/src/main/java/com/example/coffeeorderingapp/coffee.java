package com.example.coffeeorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class coffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        Toast.makeText(this, "WELCOME TO BEAN'S CAFE", Toast.LENGTH_SHORT).show();

        Button button = findViewById(R.id.Proceed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coffee.this,Order.class);
                startActivity(intent);
            }
        });

    }
}
