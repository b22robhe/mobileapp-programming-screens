package com.example.screens;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String inputText = null; //Bring variable into scope

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            inputText = extras.getString("input"); //Get the input from bundle
        }

        final TextView reversedTextView = findViewById(R.id.reversedText);
        StringBuilder reversedText = new StringBuilder(inputText).reverse(); //Reverse the input

        reversedTextView.setText(reversedText); //Add the reversed input to the TextView
    }
}