package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Twilight extends AppCompatActivity {
    PDFView book1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twilight);

       book1=(PDFView)findViewById(R.id.pdftwi);

       book1.fromAsset("Twilight.pdf.pdf").load();
    }
}
