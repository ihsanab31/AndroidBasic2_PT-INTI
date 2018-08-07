package net.sundevs.uin.latihanmediaplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    private Button btnPlay;
    private VideoView videoPlayer;

    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        mediaController = new MediaController(this);
        btnPlay = (Button) findViewById(R.id.btn_play);
        videoPlayer = (VideoView) findViewById(R.id.videoPlayer);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method panggil video
                videoPlay();
            }
        });
    }
    public void videoPlay(){
        String videoPath = "android.resource://net.sundevs.uin.latihanmediaplayer/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoPlayer.setVideoURI(uri);
        videoPlayer.setMediaController(mediaController);
        mediaController.setAnchorView(videoPlayer);
        videoPlayer.start();
    }

}
