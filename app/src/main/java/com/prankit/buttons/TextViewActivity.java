package com.prankit.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview);

        View btn = findViewById(R.id.goToButton);
        View radio_btn = findViewById(R.id.goToRadioButton);
        View toggle_btn = findViewById(R.id.goToToggleButton);

        btn.setOnClickListener(v -> {
            // code which will run when user will click this text view
            startActivity(new Intent(TextViewActivity.this, ButtonActivity.class));
        });

        radio_btn.setOnClickListener(v -> {
            // code which will run when user will click this text view
            startActivity(new Intent(TextViewActivity.this, RadioButtonActivity.class));
        });

        toggle_btn.setOnClickListener(v -> {
            // code which will run when user will click this text view
            startActivity(new Intent(TextViewActivity.this, ToggleButtonActivity.class));
        });
    }

}