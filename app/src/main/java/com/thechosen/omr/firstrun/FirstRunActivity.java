package com.thechosen.omr.firstrun;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.thechosen.omr.tutorial.TutorialActivity;
import com.thechosen.omr.home.ui.HomeActivity;

public class FirstRunActivity extends AppCompatActivity {
/*
    private static final String FIRST_RUN = "first_run";

    private SharedPreferences prefs;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            finish();
    }
}
