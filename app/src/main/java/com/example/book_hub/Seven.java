package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Seven extends AppCompatActivity {
    PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
    book=(PDFView)findViewById(R.id.pdfsev);

        book.fromAsset("1776.pdf").load();

    }
}
