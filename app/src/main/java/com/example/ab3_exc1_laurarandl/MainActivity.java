package com.example.ab3_exc1_laurarandl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    public static DataCache data = DataCache.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(e -> {
            TextInputEditText inputfield = findViewById(R.id.input);
            data.setAdress_cache(inputfield.getText().toString());
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }
}