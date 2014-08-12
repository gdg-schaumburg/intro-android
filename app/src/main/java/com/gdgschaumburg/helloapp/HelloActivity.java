package com.gdgschaumburg.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rharter on 8/11/14.
 */
public class HelloActivity extends Activity {

    private TextView mHelloText;
    private EditText mNameInput;
    private Button mSubmitButton;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        mHelloText = (TextView) findViewById(R.id.hello_text);
        mNameInput = (EditText) findViewById(R.id.name_input);

        mSubmitButton = (Button) findViewById(R.id.submit_button);
        mSubmitButton.setOnClickListener(new OnClickListener() {
            @Override public void onClick(View v) {
                String name = mNameInput.getText().toString();
                mHelloText.setText("Hello, " + name);
            }
        });
    }
}
