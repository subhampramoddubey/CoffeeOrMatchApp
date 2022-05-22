package com.example.coffeeorderingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Order extends AppCompatActivity {

    int quantity =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        Button negative = (Button) findViewById(R.id.negativeButton);
        Button plus = (Button) findViewById(R.id.plusButton);
        Button OrderButton = (Button) findViewById(R.id.OrderNow);
        TextView extraCharge = (TextView) findViewById(R.id.extraCharge);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);


        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity==0)
                    Toast.makeText(Order.this, "Invalid", Toast.LENGTH_SHORT).show();
                else {
                    quantity = quantity - 1;
                    displayqty(quantity);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                displayqty(quantity);
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked())
                    extraCharge.setVisibility(View.VISIBLE);
                else
                    extraCharge.setVisibility(View.GONE);
            }
        });

        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int price=0;

                if(checkBox.isChecked())
                {
                    price = quantity*7;
                }
                else
                {
                    price = quantity*5;
                }

                DisplayPrice(price);



            }
        });




    }

    public void DisplayPrice(int price) {

        TextView displayqtyView = (TextView) findViewById(R.id.price);
        displayqtyView.setText(""+price);

    }


    public void displayqty(int no) {
        TextView displayqtyView = (TextView) findViewById(R.id.qty);
        displayqtyView.setText(" "+no);

    }



}
