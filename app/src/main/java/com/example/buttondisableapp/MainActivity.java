package com.example.buttondisableapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonDisable;
    private TextView counter;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        Button buttonEnable = findViewById(R.id.buttonEnable);
        Button buttonReset = findViewById(R.id.buttonReset);
        counter = findViewById(R.id.counter);

        buttonDisable.setOnClickListener(v -> {
            buttonDisable.setEnabled(false);
            number++;
            counter.setText(String.valueOf(number));
        });
        buttonEnable.setOnClickListener(v -> buttonDisable.setEnabled(true));
        buttonReset.setOnClickListener(v -> {
            number=0;
            counter.setText(String.valueOf(number));
        });
    }
}
