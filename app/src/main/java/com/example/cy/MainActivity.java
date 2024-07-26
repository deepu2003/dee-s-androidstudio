package com.example.cy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        EdgeToEdge.enable ( this );
        setContentView ( R.layout.activity_main );

        b1=(Button)findViewById ( R.id.b1 );
        b2=(Button)findViewById ( R.id.b2 );

        b1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent abt=new Intent (MainActivity.this, about.class);
                startActivity ( abt );
            }
        } );
        b2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent log=new Intent (MainActivity.this, login.class);
                startActivity ( log );
            }
        } );

        ViewCompat.setOnApplyWindowInsetsListener ( findViewById ( R.id.main ) , (v , insets) -> {
            Insets systemBars = insets.getInsets ( WindowInsetsCompat.Type.systemBars () );
            v.setPadding ( systemBars.left , systemBars.top , systemBars.right , systemBars.bottom );
            return insets;
        } );
    }
}