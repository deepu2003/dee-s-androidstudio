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

public class POT extends AppCompatActivity {
    Button b16, b17, b18;
    TextView t3;
    CheckBox cb7, cb8, cb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pot);

        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        t3 = findViewById(R.id.t3);
        cb7 = findViewById(R.id.cb7);
        cb8 = findViewById(R.id.cb8);
        cb9 = findViewById(R.id.cb9);

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total = 0;
                if (cb7.isChecked()) {
                    total += 200;
                }
                if (cb8.isChecked()) {
                    total += 550;
                }
                if (cb9.isChecked()) {
                    total += 350;
                }

                t3.setText("total: " + total);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt = new Intent(POT.this, LIST.class);
                startActivity(abt);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(POT.this, THANKS.class);
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
