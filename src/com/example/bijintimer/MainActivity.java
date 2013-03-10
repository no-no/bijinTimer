package com.example.bijintimer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCountdownTimer myCountdownTimer = new MyCountdownTimer(100000,1000, (TextView)findViewById(R.id.count_text));


        myCountdownTimer.start();


    }
}