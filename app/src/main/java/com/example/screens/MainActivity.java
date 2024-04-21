package com.example.screens;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.button);
        final EditText input = findViewById(R.id.reverseInput);
        final TextView errorText = findViewById(R.id.errorText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input == null) { //Prevent the user from starting the activity if EditText is empty
                    errorText.setText("Please enter text to reverse"); //Tells the user to enter text before moving on
                }else {
                    String inputText = String.valueOf(input.getText()); //Get text inside the EditText
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class); //Intent wit the two activities
                    intent.putExtra("input", inputText); //add the input to the bundle
                    startActivity(intent);
                }
            }
        });
    }
}
