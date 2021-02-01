package com.prankit.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        // connect java variable to xml
        View button = findViewById(R.id.button);

        // set click function on button
        button.setOnClickListener(v ->
                // code which will run when user will click this button
                Toast.makeText(ButtonActivity.this, "Button clicked", Toast.LENGTH_SHORT).show());
    }
}