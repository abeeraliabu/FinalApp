package com.example.android.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class no2 extends AppCompatActivity {
    private static Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball2);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        button=(Button) findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.android.myapplication5.MainActivity");
                Toast.makeText(no2.this,
                        "BACK is clicked!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

}