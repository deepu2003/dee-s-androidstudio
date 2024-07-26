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

public class FLOWER extends AppCompatActivity {
    Button b10,b11,b12;
    TextView t1;
    CheckBox cb1,cb2,cb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        EdgeToEdge.enable ( this );
        setContentView ( R.layout.activity_flower );

        b10=(Button)findViewById ( R.id.b10 );
        b11=(Button)findViewById ( R.id.b11);
        b12=(Button)findViewById ( R.id.b12);
        t1=(TextView) findViewById ( R.id.t1);
        cb1=(CheckBox) findViewById ( R.id.cb1 );
        cb2=(CheckBox) findViewById ( R.id.cb2 );
        cb3=(CheckBox) findViewById ( R.id.cb3 );


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;
                if (cb1.isChecked()){
                    total=total+500;
                }
                if (cb2.isChecked()){
                    total=total+600;

                }
                if (cb3.isChecked()){
                    total=total+650;

                }

                t1.setText("total:"+String.valueOf(total));
            }
        });

        b11.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent abt=new Intent (FLOWER.this,LIST.class);
                startActivity ( abt );
            }
        } );
        b12.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent log=new Intent (FLOWER.this, THANKS.class);
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