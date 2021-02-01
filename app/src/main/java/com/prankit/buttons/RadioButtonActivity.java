package com.prankit.buttons;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button);

        RadioGroup radioGroup = findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            android.widget.RadioButton radioButton = findViewById(checkedId);
            switch (radioButton.getId()){
                case R.id.rb1:
                    Toast.makeText(RadioButtonActivity.this, "Button 1 chosen", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rb2:
                    Toast.makeText(RadioButtonActivity.this, "Button 2 chosen", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rb3:
                    Toast.makeText(RadioButtonActivity.this, "Button 3 chosen", Toast.LENGTH_SHORT).show();
                    break;
            }
        });
    }

}