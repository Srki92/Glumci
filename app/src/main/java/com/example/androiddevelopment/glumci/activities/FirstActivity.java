package com.example.androiddevelopment.glumci.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.androiddevelopment.glumci.R;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class FirstActivity extends Activity {

    @Override

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);
    }
}
