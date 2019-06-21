package com.example.book_hub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fiction extends AppCompatActivity {
    ImageButton div,hob,twi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);
        div=(ImageButton)findViewById(R.id.fic1);
        hob=(ImageButton)findViewById(R.id.fic2);
        twi=(ImageButton)findViewById(R.id.fic3);

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1=new Intent(Fiction.this,Divergent.class);
                startActivity(i1);

            }
        });

        hob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2=new Intent(Fiction.this,Hobbit.class);
                startActivity(i2);

            }
        });

        twi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3=new Intent(Fiction.this,Twilight.class);
                startActivity(i3);

            }
        });

    }
}
