package com.example.asadrao.theoriticalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class Main2Activity extends AppCompatActivity {

    PDFView pdf1;
    public String EXTRA_TEXT = "com.example.application.theoriticalapp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdf1 = (PDFView)findViewById(R.id.pdfView1);
        Intent intent = getIntent();
        String n = intent.getStringExtra(EXTRA_TEXT);
        switch (n)
        {
            case "History":
            {
                Toast.makeText(this, "Clicked : "+n, Toast.LENGTH_SHORT).show();
                pdf1.fromAsset("pdf1.pdf").load();
                break;
            }
        }
    }
}
