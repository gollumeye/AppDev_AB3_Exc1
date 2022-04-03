package com.example.ab3_exc1_laurarandl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static DataCache data = DataCache.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView textfield = findViewById(R.id.textView2);
        textfield.setText(data.getAdress_cache());

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(e -> {
            String search_location = textfield.getText().toString();
            Uri intent_uri = Uri.parse("geo:0,0?q=" + search_location);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, intent_uri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
    }
}