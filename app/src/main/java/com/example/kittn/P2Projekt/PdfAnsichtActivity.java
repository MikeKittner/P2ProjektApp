package com.example.kittn.P2Projekt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfAnsichtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_ansicht);

        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(MainActivity.aktuellePDF).load();
        //pdfView.fromAsset("Collections.pdf").load();
        //pdfView.fromAsset("GUI.pdf").load();
        //pdfView.fromAsset("Interfaces.pdf").load();
        //pdfView.fromAsset("Listener.pdf").load();

    }
}
