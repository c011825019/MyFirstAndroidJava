package com.example.myfirstandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello = findViewById(R.id.textview_hello);

        String text = "Hello, Android!";
        hello.setText(text);
        hello.setTextColor(Color.parseColor("#0000FF"));
        hello.setTypeface(Typeface.DEFAULT_BOLD);
    }
}