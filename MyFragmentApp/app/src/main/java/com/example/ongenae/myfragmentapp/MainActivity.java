package com.example.ongenae.myfragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ongenae.myfragmentapp.maths_activities.DerivationsActivity;
import com.example.ongenae.myfragmentapp.maths_activities.GeometryActivity;
import com.example.ongenae.myfragmentapp.releve_activities.ReleveActivity;

/**
 * Created by ongenae on 20/10/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v) {
        if (v.getId() == R.id.btn_excercice1) {
            Intent intent = new Intent(MainActivity.this, DerivationsActivity.class);
            startActivity(intent);
        }
    }

    public void onClick2(View v) {
        if (v.getId() == R.id.btn_excercice2) {
            Intent intent = new Intent(MainActivity.this, GeometryActivity.class);
            startActivity(intent);
        }
    }

    public void onClick3(View v) {
        if (v.getId() == R.id.btn_excercice3) {
            Intent intent = new Intent(MainActivity.this, ReleveActivity.class);
            startActivity(intent);
        }
    }
}