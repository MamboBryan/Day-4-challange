package com.mambobryan.day4;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar mySeekBar = findViewById(R.id.main_activity_seek_bar);
        final TextView displayTextView = findViewById(R.id.display_text);
        final TextView progressDisplayText = findViewById(R.id.progress_text_view);

        displayTextView.setText("");

        mySeekBar.setMax(100);
        mySeekBar.setProgress(0);

        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                String progressString = String.valueOf(progress);
                progressDisplayText.setText(progressString + "%");

                if (progress > 39 && progress < 46){
                    displayTextView.setText("Sweet Spot");
                } else {
                    displayTextView.setText("");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
