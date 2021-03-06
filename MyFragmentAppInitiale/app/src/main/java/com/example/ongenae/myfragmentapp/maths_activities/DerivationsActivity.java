package com.example.ongenae.myfragmentapp.maths_activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ongenae.myfragmentapp.R;
import com.example.ongenae.myfragmentapp.fragments_maths.MathsTipsFragment;

/**
 * Created by ongenae on 20/10/17.
 */

public class DerivationsActivity extends AppCompatActivity {

    private TextView mTextView;

//    private MathsTipsFragment mFrag;

    /* Attributs contenant les notes de cours, entrées en dur pour plus de
    simplicité */
    private String[] mTips = {"Si A, O, B, C, D sont cinq points tels que:\n-> (AD) et (BC) sont parallèles.\n-> (AC) et (DB) se coupent en O.\nAlors OB/OD = OC/OA = BC/AD.",
            "(a*u)' = a*u'", "(u + v)' = u' + v'", "(u*v)' = u'*v + u*v'", "(u/v)' = (u'*v - u*v')/v²", "(u^a)' = a*u'*u^a-1"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derivation);
        mTextView = (TextView) findViewById(R.id.notes_cours_deriv);

        String notes = "notes de cours :\n";
        for (int i = 0; i < mTips.length; i++) {
            notes += "-" + mTips[i] + "\n\n";
        }
        mTextView.setText(notes);


//        mFrag = (MathsTipsFragment) getFragmentManager().findFragmentById(R.id.fragment1);
//        mFrag.chooseTips(MathsTipsFragment.DERIVATION);

    }

}