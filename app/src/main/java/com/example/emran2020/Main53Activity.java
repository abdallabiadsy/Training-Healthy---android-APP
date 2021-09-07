package com.example.emran2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main53Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main53 );
    }

    public void linegraph(View view) {
        Intent my =new Intent ( Main53Activity.this , Main51Activity.class );
        startActivity ( my );
    }

    public void piegraph(View view) {
        Intent my =new Intent ( Main53Activity.this , Main24Activity.class );
        startActivity ( my );
    }
}
