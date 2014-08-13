package com.gdgschaumburg.helloapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by rharter on 8/11/14.
 */
public class HelloActivity extends Activity {

    private EditText mNameInput;
    private Button mSubmitButton;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        mNameInput = (EditText) findViewById(R.id.name_input);

        mSubmitButton = (Button) findViewById(R.id.submit_button);
        mSubmitButton.setOnClickListener(new OnClickListener() {
            @Override public void onClick(View v) {
                String name = mNameInput.getText().toString();
                greetName(name);
            }
        });
    }

    private void greetName(String name) {
        Intent i = new Intent(this, NameActivity.class);
        i.putExtra("name", name);
        startActivity(i);
    }
}
