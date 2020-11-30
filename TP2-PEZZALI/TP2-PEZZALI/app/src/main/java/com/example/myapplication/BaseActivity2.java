package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class BaseActivity2 extends BaseActivity{
    public int myView(){
        return (R.layout.baseactivity2);
    }
    public void gotoActivity(View view){
        Intent myIntent = new Intent(view.getContext(), BaseActivity1.class);
        view.getContext().startActivity(myIntent);
    }

}
