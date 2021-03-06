package com.example.marcin.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createTrack(View v) {
        Intent intentApp = new Intent(this, CreateActivity.class);

        this.startActivity(intentApp);
    }

    public void findExistingTrack(View v) {
        Intent intentApp = new Intent(this, DestinationActivity.class);

        this.startActivity(intentApp);
    }

    public void showPremium(View v) {
        Intent intentApp = new Intent(this, PremiumActivity.class);

        this.startActivity(intentApp);
    }
}
