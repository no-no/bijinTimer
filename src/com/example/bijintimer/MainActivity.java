package com.example.bijintimer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

	Button start;
	MyCountdownTimer myCountdownTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start = (Button) findViewById(R.id.startButton);

		this.myCountdownTimer = new MyCountdownTimer(180000, 1000,
				(TextView) findViewById(R.id.count_text));

		start.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// カウントダウンスタート
				myCountdownTimer.start();
			}
		});
	}

}