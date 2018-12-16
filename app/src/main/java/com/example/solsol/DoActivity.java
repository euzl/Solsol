package com.example.solsol;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoActivity extends AppCompatActivity {

    // 미디어 재생 객체
    MediaPlayer mediaPlayer;

    // 시작, 종료 버튼
    Button playButton;
    Button stopButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do);

        playButton = findViewById(R.id.play);
        stopButton = findViewById(R.id.stop);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(DoActivity.this, R.raw.relaxmusic);
                mediaPlayer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 정지
                mediaPlayer.stop();
                // 초기화
                mediaPlayer.reset();
            }
        });
    }

    @Override
    protected void onDestroy(){
        // mediaplayer 해지
        super.onDestroy();
        if(mediaPlayer!= null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
