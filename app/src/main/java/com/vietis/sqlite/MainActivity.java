package com.vietis.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView reset_number, reset_calculate, remove_number, divide,
            num_7, num_8, num_9, multiply, num_4, num_5, num_6, subtract,
            num_3, num_2, num_1, num_0, add, equal, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.reset_number:
                break;
            case R.id.reset_calculate:
                break;
        }
    }

    private void init() {
        reset_number = findViewById(R.id.reset_number);
        reset_calculate = findViewById(R.id.reset_calculate);
        remove_number = findViewById(R.id.remove_number);
        divide = findViewById(R.id.divide);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);
        num_6 = findViewById(R.id.num_6);
        num_5 = findViewById(R.id.num_5);
        num_4 = findViewById(R.id.num_4);
        num_3 = findViewById(R.id.num_3);
        num_2 = findViewById(R.id.num_2);
        num_1 = findViewById(R.id.num_1);
        num_0 = findViewById(R.id.num_0);
        multiply = findViewById(R.id.multiply);
        subtract = findViewById(R.id.subtract);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);
        result = findViewById(R.id.result);
    }

}
