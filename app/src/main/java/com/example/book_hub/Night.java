package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Night extends AppCompatActivity {
    PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);

        book=(PDFView)findViewById(R.id.pdfnit);

        book.fromAsset("night.pdf").load();
    }
}
