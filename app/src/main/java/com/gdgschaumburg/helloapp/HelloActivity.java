package com.gdgschaumburg.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rharter on 8/11/14.
 */
public class HelloActivity extends Activity {

    private TextView mHelloText;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        mHelloText = (TextView) findViewById(R.id.hello_text);
        mHelloText.setText("Hello Code");
    }
}
