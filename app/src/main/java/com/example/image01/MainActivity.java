package com.example.image01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iV;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iV = (ImageView) findViewById(R.id.iV);
        num = 2;
    }

    public void clicked(View view) {
        if (num == 1) {
            iV.setImageResource(R.drawable.one);
        } else if (num == 2) {
            iV.setImageResource(R.drawable.two);
        } else {
            iV.setImageResource(R.drawable.three);
        }
    }
}