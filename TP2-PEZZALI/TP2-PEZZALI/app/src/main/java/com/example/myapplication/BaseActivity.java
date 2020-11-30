package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public abstract class BaseActivity extends MainActivity {
    public static int nbr = 5;
    public int nbr1 = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView());
        setText();

    }
    public abstract int myView();
    public abstract void gotoActivity(View view);
    public void setPlus(View view){
        nbr++;
        nbr1++;
        TextView mynbr = findViewById(R.id.nbr);
        TextView mynbr1 = findViewById(R.id.nbr1);
        String monIntEnString = String.valueOf(nbr);
        String monIntEnString1 = String.valueOf(nbr1);

        mynbr.setText(monIntEnString);
        mynbr1.setText(monIntEnString1);
    }
    public void setMoins(View view){
        nbr--;
        nbr1--;
        TextView mynbr = findViewById(R.id.nbr);
        TextView mynbr1 = findViewById(R.id.nbr1);
        String monIntEnString = String.valueOf(nbr);
        String monIntEnString1 = String.valueOf(nbr1);

        mynbr.setText(monIntEnString);
        mynbr1.setText(monIntEnString1);
    }
    public void setText(){
        TextView mynbr = findViewById(R.id.nbr);
        TextView mynbr1 = findViewById(R.id.nbr1);
        String monIntEnString = String.valueOf(nbr);
        String monIntEnString1 = String.valueOf(nbr1);
        mynbr.setText(monIntEnString);
        mynbr1.setText(monIntEnString1);
    }

}
