package com.example.cy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SEED extends AppCompatActivity {
    Button b13, b14, b15;
    TextView t2;
    CheckBox cb4, cb5, cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seed);

        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        t2 = findViewById(R.id.t2);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total = 0;
                if (cb4.isChecked()) {
                    total += 300;
                }
                if (cb5.isChecked()) {
                    total += 100;
                }
                if (cb6.isChecked()) {
                    total += 150;
                }

                t2.setText("total: " + total);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt = new Intent(SEED.this, LIST.class);
                startActivity(abt);
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(SEED.this, THANKS.class);
                startActivity(log);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });
    }
}
