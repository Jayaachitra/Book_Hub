package com.example.book_hub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diary extends AppCompatActivity {
    PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        book=(PDFView)findViewById(R.id.pdfdia);

        book.fromAsset("diary.pdf").load();
    }
}
