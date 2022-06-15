package com.example.senemgocer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
 ListView lsv;
    String arc[]={"Audi","Bugatti","Chrysler","Dacia","Ferrari","Jaguar","Hyundai"};
    int imgs[]={R.drawable.audi,R.drawable.bugatti,R.drawable.chrysler,R.drawable.dacia,R.drawable.ferrari,R.drawable.jaguar,R.drawable.hyundai};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final forWait wait=new forWait(MainActivity.this);
       wait.load();
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                wait.finish();

            }
        },10000);

        lsv=findViewById(R.id.lsv);


        ArrayAdapter<String> adp=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arc);
        lsv.setAdapter(adp);

        lsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent git=new Intent(getApplicationContext(),reshow.class);

                git.putExtra("brand",arc[i]);
                git.putExtra("photo",imgs[i]);


                startActivity(git);



            }
        });




    }
}