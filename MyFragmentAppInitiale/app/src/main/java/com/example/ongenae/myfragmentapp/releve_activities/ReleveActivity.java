package com.example.ongenae.myfragmentapp.releve_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ongenae.myfragmentapp.R;
import com.example.ongenae.myfragmentapp.fragments_releve.InstructionsReleveFragment;

/**
 * Created by Avast on 21/10/2017.
 */

public class ReleveActivity extends AppCompatActivity {

    InstructionsReleveFragment mFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_releve);

        mFrag = (InstructionsReleveFragment) getFragmentManager().findFragmentById(R.id.fragment_instruction2);

        if (mFrag == null || !mFrag.isInLayout()) {
            // Cela veut dire qu'on est en mode portrait, on peut définir un
//            comportement différent ou changer le contenu d'un textview par exemple
        } else {
            // On est en mode paysage, de même si l'on souhaite ajouter du code spécifique
        }
    }

    public void onClickInstructions (View v) {
        if (v.getId() == R.id.btn_instructions) {
            Intent intent = new Intent(ReleveActivity.this, InstructionsActivity.class);
            startActivity(intent);
        }
    }
}
