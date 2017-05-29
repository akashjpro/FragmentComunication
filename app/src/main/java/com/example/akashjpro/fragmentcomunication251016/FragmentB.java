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
import android.widget.Toast;

/**
 * Created by Akashjpro on 10/25/2016.
 */

public class FragmentB extends Fragment {

    Button btnB;
    TextView txtB;
    EditText edtB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        txtB = (TextView) view.findViewById(R.id.txtB);
        btnB = (Button) view.findViewById(R.id.btnB);
        edtB = (EditText) view.findViewById(R.id.editTextB);


        Bundle bundle = getArguments();
        String noidung = bundle.getString("monhoc");
        txtB.append("\n" + noidung);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentA.setText();
                Toast.makeText(getActivity(), "da bam", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public void setText(){
        txtB.setText("thay doi");
    }
}
