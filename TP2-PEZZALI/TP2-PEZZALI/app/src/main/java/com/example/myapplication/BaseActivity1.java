package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseActivity1 extends BaseActivity{
    public int myView(){
        return (R.layout.baseactivity1);
    }
    public void gotoActivity(View view){
        Intent myIntent = new Intent(view.getContext(), BaseActivity2.class);
        view.getContext().startActivity(myIntent);
    }

}
