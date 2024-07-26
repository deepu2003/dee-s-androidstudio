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

public class about extends AppCompatActivity {
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        EdgeToEdge.enable ( this );
        setContentView ( R.layout.activity_about );
        b3=(Button)findViewById ( R.id.b3 );

        b3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent main=new Intent (about.this, MainActivity.class);
                startActivity ( main );
            }
        } );

        ViewCompat.setOnApplyWindowInsetsListener ( findViewById ( R.id.main ) , (v , insets) -> {
            Insets systemBars = insets.getInsets ( WindowInsetsCompat.Type.systemBars () );
            v.setPadding ( systemBars.left , systemBars.top , systemBars.right , systemBars.bottom );
            return insets;
        } );
    }
}