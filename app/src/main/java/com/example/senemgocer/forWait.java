package com.example.senemgocer;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class forWait {


    private Activity a;
    private AlertDialog e;
    forWait( Activity m){
        a=m;

    }
    void load(){


        AlertDialog.Builder b=new AlertDialog.Builder(a);
        LayoutInflater inflater=a.getLayoutInflater();
        b.setView(inflater.inflate(R.layout.forwait,null));
        b.setCancelable(false);
        e=b.create();
        e.show();
    }
    void finish(){
        e.dismiss();
    }
}