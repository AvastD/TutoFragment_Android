package com.example.ongenae.myfragmentapp.fragments_maths;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ongenae.myfragmentapp.R;

/**
 * Created by ongenae on 20/10/17.
 */

public class MathsTipsFragment extends Fragment {

    public static int NONE = 0;
    public static int DERIVATION = 1;
    public static int GEOMETRIE = 2;

    private TextView mText;

//    private String[] mTips = {"Si A, O, B, C, D sont cinq points tels que:\n-> (AD) et (BC) sont parallèles.\n-> (AC) et (DB) se coupent en O.\nAlors OB/OD = OC/OA = BC/AD.",
//            "(a*u)' = a*u'", "(u + v)' = u' + v'", "(u*v)' = u'*v + u*v'", "(u/v)' = (u'*v - u*v')/v²", "(u^a)' = a*u'*u^a-1"};
    private String[] mDerivationTips = {"(a*u)' = a*u'", "(u + v)' = u' + v'", "(u*v)' = u'*v + u*v'", "(u/v)' = (u'*v - u*v')/v²", "(u^a)' = a*u'*u^a-1"};
    private String[] mGeometrieTips = {"Si A, O, B, C, D sont cinq points tels que:\n-> (AD) et (BC) sont parallèles.\n-> (AC) et (DB) se coupent en O.\nAlors OB/OD = OC/OA = BC/AD."};

    // inflate la vue à utiliser
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maths, container, false); // pourquoi false déjà ?
    }

    // permet de modifier les élements contenus dans la vue
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mText = (TextView) view.findViewById(R.id.text_fragment);

//        String notes = "Notes de cours :\n";
//        for (int i = 0; i < mTips.length; i++) {
//            notes += "- " + mTips[i] + "\n\n";
//        }
//        mText.setText(notes);
    }

    /**
     * permet de définir quelles rêgles sont à afficher
     * @param rule
     */
    public void chooseTips(int rule) {
        String tips = "Notes de cours :\n";
        if (rule == this.NONE) {
            tips += "Pas de notes de cours pour cet excercice, bonne chance !";
        } else if (rule == this.DERIVATION) {
            for (int i = 0; i < mDerivationTips.length; i++) {
                tips += "- " + mDerivationTips[i] + "\n\n";
            }
        } else if (rule == this.GEOMETRIE) {
            for (int i = 0; i < mGeometrieTips.length; i++) {
                tips += "- " + mGeometrieTips[i] + "\n\n";
            }
        }
        mText.setText(tips);
    }
}
