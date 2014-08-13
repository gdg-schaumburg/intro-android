package com.gdgschaumburg.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rharter on 8/13/14.
 */
public class NameActivity extends Activity {

    private TextView mName;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        mName = (TextView) findViewById(R.id.name);

        String name = getIntent().getStringExtra("name");
        mName.setText("Hello, " + name + "!");
    }
}