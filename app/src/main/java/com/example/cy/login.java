package com.example.cy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {
    Button b5, b4;
    EditText p1, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        p1 = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt = new Intent(login.this, MainActivity.class);
                startActivity(abt);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(login.this);
                alert.setTitle("INPUT VALIDATION");
                alert.setCancelable(true);

                String phoneNumber = p1.getText().toString();
                String emailAddress = email.getText().toString();
                if (phoneNumber.length() == 10 && Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()) {
                    alert.setMessage("PHONE NUMBER AND EMAIL ARE VALID");
                    alert.show();
                    Intent log = new Intent(login.this, LIST.class);
                    startActivity(log);
                } else {
                    alert.setMessage("PHONE NUMBER OR EMAIL IS INVALID");
                    alert.show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });
    }
}
