package com.example.marcin.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EndOfTrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_track);
    }

    public void goToMain(View v) {
        Intent intentApp = new Intent(this, MainActivity.class);

        this.startActivity(intentApp);
    }
}
