package com.example.ab3_exc1_laurarandl;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutPage extends AppCompatActivity{
    public static DataCache data = DataCache.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_page);

        Button back = findViewById(R.id.button3);
        back.setOnClickListener(e->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        ImageView instagram = findViewById(R.id.imageView2);
        instagram.setOnClickListener(e->{
            Uri uri = Uri.parse("http://instagram.com/some_fake_account");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        ImageView facebook = findViewById(R.id.imageView5);
        facebook.setOnClickListener(e->{
            Uri uri = Uri.parse("https://www.facebook.com/some_fake_account/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        ImageView twitter = findViewById(R.id.imageView4);
        twitter.setOnClickListener(e->{
            Uri uri = Uri.parse("https://twitter.com/some_fake_account");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        ImageView mail = findViewById(R.id.imageView6);
        mail.setOnClickListener(e ->{
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, "larandl@edu.aau.at");
            startActivity(intent);
        });

    }
}
