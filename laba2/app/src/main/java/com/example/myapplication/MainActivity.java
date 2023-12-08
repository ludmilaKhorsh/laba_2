package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloText);
        startButton = (ImageButton) findViewById(R.id.startButton);
    }

    public void OnStartButtonClick(View view) {
            startButton.setImageResource(R.drawable.android);
            helloText.setVisibility(View.VISIBLE);
            startButton.setClickable(false);


    }
}