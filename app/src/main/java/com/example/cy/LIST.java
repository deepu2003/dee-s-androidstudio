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

public class LIST extends AppCompatActivity {
    Button b6,b7,b8,b9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        EdgeToEdge.enable ( this );
        setContentView ( R.layout.activity_list );

        b6=(Button)findViewById ( R.id.b6 );
        b7=(Button)findViewById ( R.id.b7 );
        b8=(Button)findViewById ( R.id.b8 );
        b9=(Button)findViewById ( R.id.b9 );

        b6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent abt=new Intent (LIST.this,FLOWER.class);
                startActivity ( abt );
            }
        } );
        b7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent log=new Intent (LIST.this, SEED.class);
                startActivity ( log );
            }
        } );
        b8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent abt1=new Intent (LIST.this,POT.class);
                startActivity ( abt1 );
            }
        } );
        b9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent log1=new Intent (LIST.this, MainActivity.class);
                startActivity ( log1 );
            }
        } );



        ViewCompat.setOnApplyWindowInsetsListener ( findViewById ( R.id.main ) , (v , insets) -> {
            Insets systemBars = insets.getInsets ( WindowInsetsCompat.Type.systemBars () );
            v.setPadding ( systemBars.left , systemBars.top , systemBars.right , systemBars.bottom );
            return insets;
        } );
    }
}