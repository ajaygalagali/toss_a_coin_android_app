package com.astro.tossacoin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Random rando;
    int numb;
    boolean rotFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        rando = new Random();
        rotFlag =true;

    }

    @SuppressLint("Range")
    public void tossClicked(View view) {
        numb = rando.nextInt(2);

        if(numb==0){
            textView.setText("HEAD");
            textView.setBackgroundColor(Color.rgb(12,23,44));

        }else{
            textView.setText("TAIL");
            textView.setBackgroundColor(Color.rgb(34,555,423));

        }
        if(rotFlag){
            textView.animate().rotation(360);
            rotFlag = false;
        }else {
            textView.animate().rotation(0);
            rotFlag = true;
        }
    }
}

