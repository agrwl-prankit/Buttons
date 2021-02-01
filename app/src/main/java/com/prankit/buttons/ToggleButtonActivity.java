package com.prankit.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toggle_button);

        android.widget.ToggleButton toggleButton = findViewById(R.id.tb);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                Toast.makeText(ToggleButtonActivity.this, "Checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ToggleButtonActivity.this, "Not checked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}