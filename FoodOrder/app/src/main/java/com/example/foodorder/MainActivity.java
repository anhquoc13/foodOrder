package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Size
    RadioGroup rbgSize;
    //RadioButton rbLarge;
    //RadioButton rbMedium;

    //Crust
    RadioGroup rbgCrust;
    //RadioButton rbThick;
    //RadioButton rbThin;

    //Topping
    CheckBox cbCrayfish;
    CheckBox cbShrimps;
    CheckBox cbMozzarella;
    CheckBox cbTurkey;
    CheckBox cbHam;
    CheckBox cbMeatballs;
    CheckBox cbBBQChick;
    CheckBox cbBacon;

    //Beverage
    CheckBox cbMargarita;
    CheckBox cbCerveza;
    CheckBox cbSoda;
    CheckBox cbTequilla;

    Button btnOrder;
    Button btnAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbgSize = (RadioGroup) findViewById(R.id.rbgSize);
        //rbLarge = (RadioButton) findViewById(R.id.rbLarge);
        //rbMedium = (RadioButton) findViewById(R.id.rbMedium);
        rbgCrust = (RadioGroup) findViewById(R.id.rbgCrust);
        //rbThick = (RadioButton) findViewById(R.id.rbThick);
        //rbThin = (RadioButton) findViewById(R.id.rbThin);

        ArrayList<String> selectedTopping = new ArrayList<>();
        ArrayList<String> selectedBeverage = new ArrayList<>();
        //Topping
        cbCrayfish = (CheckBox) findViewById(R.id.cbCrayfish);
        cbShrimps = (CheckBox) findViewById(R.id.cbShrimps);;
        cbMozzarella = (CheckBox) findViewById(R.id.cbMozzarella);
        cbTurkey = (CheckBox) findViewById(R.id.cbTurkey);;
        cbHam = (CheckBox) findViewById(R.id.cbHam);;
        cbMeatballs = (CheckBox) findViewById(R.id.cbMeatballs);;
        cbBBQChick = (CheckBox) findViewById(R.id.cbBBQChick);;
        cbBacon = (CheckBox) findViewById(R.id.cbBacon);;
        //Beverage
        cbMargarita = (CheckBox) findViewById(R.id.cbMargarita);;
        cbCerveza = (CheckBox) findViewById(R.id.cbCerveza);;
        cbSoda = (CheckBox) findViewById(R.id.cbSoda);;
        cbTequilla = (CheckBox) findViewById(R.id.cbTequilla);;

        cbCrayfish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbCrayfish.getText().toString());
                }else{
                    selectedTopping.remove(cbCrayfish.getText().toString());
                }
            }
        });
        cbShrimps.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbShrimps.getText().toString());
                }else{
                    selectedTopping.remove(cbShrimps.getText().toString());
                }
            }
        });
        cbMozzarella.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbMozzarella.getText().toString());
                }else{
                    selectedTopping.remove(cbMozzarella.getText().toString());
                }
            }
        });
        cbTurkey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbTurkey.getText().toString());
                }else{
                    selectedTopping.remove(cbTurkey.getText().toString());
                }
            }
        });
        cbHam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbHam.getText().toString());
                }else{
                    selectedTopping.remove(cbHam.getText().toString());
                }
            }
        });
        cbMeatballs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbMeatballs.getText().toString());
                }else{
                    selectedTopping.remove(cbMeatballs.getText().toString());
                }
            }
        });
        cbBBQChick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbBBQChick.getText().toString());
                }else{
                    selectedTopping.remove(cbBBQChick.getText().toString());
                }
            }
        });
        cbBacon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedTopping.add(cbBacon.getText().toString());
                }else{
                    selectedTopping.remove(cbBacon.getText().toString());
                }
            }
        });

        cbMargarita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedBeverage.add(cbMargarita.getText().toString());
                }else{
                    selectedBeverage.remove(cbMargarita.getText().toString());
                }
            }
        });
        cbCerveza.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedBeverage.add(cbCerveza.getText().toString());
                }else{
                    selectedBeverage.remove(cbCerveza.getText().toString());
                }
            }
        });
        cbSoda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedBeverage.add(cbSoda.getText().toString());
                }else{
                    selectedBeverage.remove(cbSoda.getText().toString());
                }
            }
        });
        cbTequilla.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectedBeverage.add(cbTequilla.getText().toString());
                }else{
                    selectedBeverage.remove(cbTequilla.getText().toString());
                }
            }
        });


        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnAddress = (Button) findViewById(R.id.btnAddress);

        btnAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://goo.gl/maps/NGjWob8DfMPwU2Xx6";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);

                int selectedSizeID = rbgSize.getCheckedRadioButtonId();
                RadioButton rbSize = (RadioButton) findViewById(selectedSizeID);
                intent.putExtra("Size", rbSize.getText());

                int selectedCrustID = rbgCrust.getCheckedRadioButtonId();
                RadioButton rbCrust = (RadioButton) findViewById(selectedCrustID);
                intent.putExtra("Crust", rbCrust.getText());

                intent.putStringArrayListExtra("Topping", selectedTopping);
                intent.putStringArrayListExtra("Beverage", selectedBeverage);

                startActivity(intent);
            }
        });
    }
}