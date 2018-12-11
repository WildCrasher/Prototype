package com.example.marcin.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TrackViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_view);
    }

    public void endRiding(View v) {
        Intent intentApp = new Intent(this, EndOfTrackActivity.class);

        this.startActivity(intentApp);
    }
}
