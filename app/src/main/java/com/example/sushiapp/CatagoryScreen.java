package com.example.sushiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class CatagoryScreen extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory_screen);
    }

    /** Called when the user taps the Send button */
    public void category_temaki(View view) {
        Intent intent = new Intent(this, category_temaki.class);
        startActivity(intent);
    }

}
