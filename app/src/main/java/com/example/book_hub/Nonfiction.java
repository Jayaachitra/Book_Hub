package com.example.book_hub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Nonfiction extends AppCompatActivity {
    ImageButton sev,diary,night;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonfiction);

        sev=(ImageButton)findViewById(R.id.nfic2);
        diary=(ImageButton)findViewById(R.id.nfic3);
        night=(ImageButton)findViewById(R.id.nfic1);

        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Nonfiction.this,Night.class);
                startActivity(i1);
            }
        });

        sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Nonfiction.this,Seven.class);
                startActivity(i2);

            }
        });

        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Nonfiction.this,Diary.class);
                startActivity(i3);

            }
        });
    }
}
