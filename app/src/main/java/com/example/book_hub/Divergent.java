package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Divergent extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divergent);

        book1=(PDFView)findViewById(R.id.pdfdiv);

        book1.fromAsset("Divergent.pdf").load();
    }
}
