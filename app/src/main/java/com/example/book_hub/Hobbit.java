package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Hobbit extends AppCompatActivity {
    PDFView book2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbit);

        book2=(PDFView)findViewById(R.id.pdfhob);

        book2.fromAsset("Hobbit.pdf.pdf").load();
    }
}
