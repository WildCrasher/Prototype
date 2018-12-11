package com.example.marcin.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TracksListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void showTrackDetails(View v) {
        Intent intentApp = new Intent(this, TrackDetailsActivity.class);

        this.startActivity(intentApp);
    }
}
