package com.example.akashjpro.fragmentcomunication251016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHT;
    Button btnMain;
    static FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMain = (Button) findViewById(R.id.buttonMain);
        txtHT = (TextView) findViewById(R.id.txtView);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
                fragmentA.setText();

//                FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
//                fragmentB.setText();

                //add Fragment B truyen du lieu
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                FragmentB fragmentB1 = new FragmentB();

                Bundle bundle = new Bundle();
                bundle.putString("monhoc", "Lap trinh androi");
                fragmentB1.setArguments(bundle);

                fragmentTransaction.add(R.id.fragmentContent, fragmentB1);
                fragmentTransaction.commit();

            }
        });
    }
}
