package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textValue = findViewById(R.id.text_value);
                int originalValue = Integer.parseInt(textValue.getText().toString());
                int newVal = MyWorker.doubleTheValue(originalValue);
                textValue.setText(Integer.toString(newVal));

            }
        });
    }
}
