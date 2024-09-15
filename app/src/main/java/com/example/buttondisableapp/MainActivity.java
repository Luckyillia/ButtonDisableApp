package com.example.buttondisableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonDisable;
    private Button buttonEnable;
    private TextView counter;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja przycisku poprzez ID z pliku XML
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);
        counter = findViewById(R.id.counter);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(false);
                number++;
                counter.setText(String.valueOf(number));
            }
        });

        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Po kliknięciu przycisk zostaje dezaktywowany
                buttonDisable.setEnabled(true);

            }
        });
    }
}
