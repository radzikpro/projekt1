package com.bojko.radoslaw.apka;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView) findViewById(R.id.textView);
        t1.setText("Kocham Alę");
        t1.setTextColor(Color.RED);
    }

    R.layout.activity_main
}
