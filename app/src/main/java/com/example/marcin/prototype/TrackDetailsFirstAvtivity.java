package com.example.marcin.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TrackDetailsFirstAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_details_first_avtivity);
    }

    public void showTrackProgress(View v) {
        Intent intentApp = new Intent(this, TrackViewActivity.class);

        this.startActivity(intentApp);
    }
}
