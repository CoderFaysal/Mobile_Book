package com.coderfaysal.ebooklibrary;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class Home extends AppCompatActivity {

    LinearLayout book1, book2, book3, book4, book5, book6, book7, book8, book9, book10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        book3 = findViewById(R.id.book3);
        book4 = findViewById(R.id.book4);
        book5 = findViewById(R.id.book5);
        book6 = findViewById(R.id.book6);
        book7 = findViewById(R.id.book7);
        book8 = findViewById(R.id.book8);
        book9 = findViewById(R.id.book9);
        book10 = findViewById(R.id.book10);


        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1_N-FMFj1DsBJfaSmjtA7NrGdcfTylHTY/view?usp=sharing";
            }
        });


        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1PnFLPRyi21fSitBylZCGamijkoZoQIWe/view?usp=sharing";
            }
        });


        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1OwyBnfdO9CORXNcZ-LjGB_lpqiAZdJHj/view?usp=sharing";
            }
        });


        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1OlXAPQ5In3hiU1v-foxxF8Dz_kgtVZWe/view?usp=sharing";
            }
        });


        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/17q-SkCXuw5dL9GnPYM4cus3POWrUD42u/view?usp=sharing";
            }
        });


        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1QLIQlklRMD0iER5R5rgX3rgk0aRlmczA/view?usp=sharing";
            }
        });

        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1mmgCXjIZluj8nvmqUizu-frf3dZu99NI/view?usp=sharing";
            }
        });

        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/126MjLrf43a7oI5yPRP5a2mY6amoRC8HH/view?usp=sharing";
            }
        });

        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/17q-SkCXuw5dL9GnPYM4cus3POWrUD42u/view?usp=sharing";
            }
        });


        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, PDFViwer.class);
                startActivity(intent);
                PDFViwer.WEBSITE_LINK = "https://drive.google.com/file/d/1QLIQlklRMD0iER5R5rgX3rgk0aRlmczA/view?usp=sharing";
            }
        });





    }


}