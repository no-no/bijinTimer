package com.example.bijintimer;

import android.widget.TextView;
import android.os.CountDownTimer;

public class MyCountdownTimer extends CountDownTimer {

	TextView timerText;

    public MyCountdownTimer(long millisInFuture, long countDownInterval, TextView timerText) {
		super(millisInFuture, countDownInterval);
		this.timerText = timerText;
	}

    // カウントダウン処理
    public void onTick(long millisUntilFinished){
    	this.timerText.setText(""+millisUntilFinished/1000);
    }
    // カウントが0になった時の処理
    public void onFinish(){
    	this.timerText.setText("タイムオーバー");
    }

}
