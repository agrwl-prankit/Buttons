package com.prankit.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {

    private TextView show, btn;
    private CheckBox mon, tue, wed, thu, fri, sat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        show = findViewById(R.id.tv_check);
        btn = findViewById(R.id.check_btn);
        mon = findViewById(R.id.mon);
        tue = findViewById(R.id.tue);
        wed = findViewById(R.id.wed);
        thu = findViewById(R.id.thu);
        fri = findViewById(R.id.fri);
        sat = findViewById(R.id.sat);

        btn.setOnClickListener(v -> {
            StringBuilder builder = new StringBuilder();
            builder.append("Is " + mon.getText().toString() + " checked? = " + mon.isChecked() + "\n");
            builder.append("Is " + tue.getText().toString() + " checked? = " + tue.isChecked() + "\n");
            builder.append("Is " + wed.getText().toString() + " checked? = " + wed.isChecked() + "\n");
            builder.append("Is " + thu.getText().toString() + " checked? = " + thu.isChecked() + "\n");
            builder.append("Is " + fri.getText().toString() + " checked? = " + fri.isChecked() + "\n");
            builder.append("Is " + sat.getText().toString() + " checked? = " + sat.isChecked() + "\n");
            show.setText(builder);
        });
    }
}