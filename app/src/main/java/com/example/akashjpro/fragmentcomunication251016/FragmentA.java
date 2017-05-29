package com.example.akashjpro.fragmentcomunication251016;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Akashjpro on 10/25/2016.
 */

public class FragmentA extends Fragment {

    Button btnA;
    TextView txtA;
    EditText edtA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        txtA = (TextView) view.findViewById(R.id.txtA);
        btnA = (Button) view.findViewById(R.id.btnA);
        edtA = (EditText) view.findViewById(R.id.editTextA);

        txtA.setText("Thay doi a roi");

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtMain = (TextView) getActivity().findViewById(R.id.txtView);// getActivity tim man hinh dang dung
                txtMain.setText(edtA.getText().toString().trim());
            }
        });

        return view;
    }
    public void setText(){
        txtA.setText("Change text by main");
    }
}
