package com.example.book_hub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fic,nonfic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fic=(Button)findViewById(R.id.b1);
        nonfic=(Button)findViewById(R.id.b2);

        fic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Fiction.class);
                startActivity(i1);

            }
        });

        nonfic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,Nonfiction.class);
                startActivity(i2);

            }
        });
    }
}
