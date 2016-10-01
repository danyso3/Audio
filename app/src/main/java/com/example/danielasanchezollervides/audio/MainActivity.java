package com.example.danielasanchezollervides.audio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpBailando;

           @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            MediaPlayer mplayer = MediaPlayer.create(this, R.raw.Elperdedor);

            mpBailando = MediaPlayer.create(this, R.raw.Bailando);

            mplayer.start();}


    public void playAudio(View view) {mpBailando.start();
    }

    public void pauseAudio(View view) {
        mpBailando.pause();
    }
}


