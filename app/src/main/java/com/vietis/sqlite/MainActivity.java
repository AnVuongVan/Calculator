package com.vietis.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String changeFrom = "VND";
    private String changeTo = "VND";

    private List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float USD_TO_VND = 23178.0f;
        float USD_TO_EUR = 0.84f;
        float VND_TO_EUR = 0.000036f;
        float VND_TO_USD = 0.000043f;
        float EUR_TO_USD = 1.19f;
        float EUR_TO_VND = 27475.0f;

        EditText amountEt = findViewById(R.id.amount);
        TextView resultTv = findViewById(R.id.result);

        items = new ArrayList<>();
        items.add("VND");
        items.add("USD");
        items.add("EUR");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, items);
        Spinner spinnerFrom = findViewById(R.id.spinnerFrom);
        Spinner spinnerTo = findViewById(R.id.spinnerTo);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        spinnerFrom.setSelection(0);
        spinnerTo.setSelection(0);

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                changeFrom = items.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                changeTo = items.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        switch (changeFrom) {
            case "USD":
                switch (changeTo) {
                    case "VND":
                        changeMoney(amountEt, resultTv, USD_TO_VND);
                        break;
                    case "EUR":
                        changeMoney(amountEt, resultTv, USD_TO_EUR);
                        break;
                    default:
                        resultTv.setText(amountEt.getText().toString().trim());
                        break;
                }
                break;
            case "VND":
                switch (changeTo) {
                    case "EUR":
                        changeMoney(amountEt, resultTv, VND_TO_EUR);
                        break;
                    case "USD":
                        changeMoney(amountEt, resultTv, VND_TO_USD);
                        break;
                    default:
                        resultTv.setText(amountEt.getText().toString().trim());
                        break;
                }
                break;
            case "EUR":
                switch (changeTo) {
                    case "USD":
                        changeMoney(amountEt, resultTv, EUR_TO_USD);
                        break;
                    case "VND":
                        changeMoney(amountEt, resultTv, EUR_TO_VND);
                        break;
                    default:
                        resultTv.setText(amountEt.getText().toString().trim());
                        break;
                }
                break;
        }
    }

    private void changeMoney(EditText amountEt, final TextView resultTv, final float change) {
        amountEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                float money = Integer.parseInt(editable.toString()) * change;
                resultTv.setText(String.valueOf(money));
            }
        });
    }

}
