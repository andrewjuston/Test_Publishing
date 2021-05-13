package com.jessica.testingsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jessica.mylibrary.TesterObject;

public class MainActivity extends AppCompatActivity {
    TesterObject test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = new TesterObject();
        String halooo = test.echo("Halo halo");
        Toast.makeText(this, halooo, Toast.LENGTH_SHORT).show();
    }
}