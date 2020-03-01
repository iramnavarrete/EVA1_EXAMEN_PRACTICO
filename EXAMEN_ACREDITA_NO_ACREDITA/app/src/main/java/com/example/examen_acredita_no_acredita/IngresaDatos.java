package com.example.examen_acredita_no_acredita;


import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class IngresaDatos extends Fragment {

    ImageView image;
    TextView textView1, textView2;
    EditText editText1, editText2;
    Figura figura;
    //int position;

    public IngresaDatos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ConstraintLayout constr = (ConstraintLayout) inflater.inflate(R.layout.fragment_ingresa_datos, container, false);
        image=constr.findViewById(R.id.imageView2);
        textView1=constr.findViewById(R.id.textView);
        textView2=constr.findViewById(R.id.textView2);
        editText1=constr.findViewById(R.id.editText);
        editText2=constr.findViewById(R.id.editText2);


        image.setImageResource(figura.getImagen());

        if (figura.getNombre().equals("Círculo")){
            textView1.setText("Radio");
            textView2.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
        }
        return constr;
    }

    public void onMessageFromMain(Figura figura){
        this.figura=figura;
    }
}
