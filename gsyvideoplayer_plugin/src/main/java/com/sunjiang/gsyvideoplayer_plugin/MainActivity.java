package com.sunjiang.gsyvideoplayer_plugin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

public class MainActivity extends AppCompatActivity {
    private StandardGSYVideoPlayer videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoPlayer = new StandardGSYVideoPlayer(this);
    }
}
