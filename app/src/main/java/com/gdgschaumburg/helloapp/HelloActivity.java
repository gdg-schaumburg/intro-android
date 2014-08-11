package com.gdgschaumburg.helloapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by rharter on 8/11/14.
 */
public class HelloActivity extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
}
