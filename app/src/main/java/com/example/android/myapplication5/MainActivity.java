package com.example.android.myapplication5;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.pp);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.myapplication5.no1");
                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.oo);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.myapplication5.no2");
                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.zz);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.myapplication5.no3");
                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.dd);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.myapplication5.no4");
                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.rr);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.android.myapplication5.no5");
                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }}