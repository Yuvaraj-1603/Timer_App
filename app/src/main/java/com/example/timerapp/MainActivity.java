package com.example.timerapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView timerText;
    private Button startButton, pauseButton, resetButton;
    private CountDownTimer countDownTimer;
    private boolean isRunning = false;
    private long timeLeftInMillis = 30000; // 30 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerText = findViewById(R.id.timer_text);
        startButton = findViewById(R.id.start_button);
        pauseButton = findViewById(R.id.pause_button);
        resetButton = findViewById(R.id.reset_button);

        updateTimerText();

        startButton.setOnClickListener(v -> startTimer());
        pauseButton.setOnClickListener(v -> pauseTimer());
        resetButton.setOnClickListener(v -> resetTimer());
    }

    private void startTimer() {
        if (!isRunning) {
            countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    timeLeftInMillis = millisUntilFinished;
                    updateTimerText();
                }

                @Override
                public void onFinish() {
                    isRunning = false;
                    startButton.setEnabled(true);
                }
            }.start();
            isRunning = true;
            startButton.setEnabled(false);
        }
    }

    private void pauseTimer() {
        if (isRunning) {
            countDownTimer.cancel();
            isRunning = false;
            startButton.setEnabled(true);
        }
    }

    private void resetTimer() {
        timeLeftInMillis = 30000; // Reset to 30 seconds
        updateTimerText();
        pauseTimer();
    }

    private void updateTimerText() {
        int seconds = (int) (timeLeftInMillis / 1000);
        timerText.setText(String.format("00:%02d", seconds));
    }
}

