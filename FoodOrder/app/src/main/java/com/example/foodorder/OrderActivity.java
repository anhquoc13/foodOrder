package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    TextView txtDetails;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        
        String size = intent.getStringExtra("Size");
        String crust = intent.getStringExtra("Crust");
        ArrayList<String> selectedTopping = intent.getStringArrayListExtra("Topping");
        ArrayList<String> selectedBeverage = intent.getStringArrayListExtra("Beverage");

        txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("Order Details: \n\n"
                            + "Pizza have: \n"
                            + "\tSize: " + size +"\n"
                            + "\tCrust: " + crust +"\n"
                            + "\tTopping: " + listToString(selectedTopping) +"\n"
                            + "\tBeverage: " + listToString(selectedBeverage) +"\n");
    }

    private String listToString(ArrayList<String> list) {
        StringBuilder result = new StringBuilder();
        for (String topping : list) {
            result.append(topping).append(", ");
        }
        result.append("\b.");
        return result.toString();
    }
}