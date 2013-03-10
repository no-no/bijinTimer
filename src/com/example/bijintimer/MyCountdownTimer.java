package com.example.bijintimer;

import android.widget.TextView;
import android.os.CountDownTimer;

public class MyCountdownTimer extends CountDownTimer {

	TextView timerText;

	public MyCountdownTimer(long millisInFuture, long countDownInterval,
			TextView timerText) {
		super(millisInFuture, countDownInterval);
		this.timerText = timerText;
	}

	// カウントダウン処理
	public void onTick(long millisUntilFinished) {

		long second = millisUntilFinished / 1000;

		long minutes = second / 60;
		long seconds = second % 60;

		this.timerText.setText(minutes + "：" + seconds);
	}

	// カウントが0になった時の処理
	public void onFinish() {
		this.timerText.setText("終了");
	}

}
