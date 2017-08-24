package com.example.liuwanhao.firstdemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt;
    private long time = System.currentTimeMillis();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.click);
        bt.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - time > 3000) {
            Log.v("ceshi", "systemtime:" + System.currentTimeMillis() + "; time" + time);
            super.onBackPressed();
        } else {
            Toast.makeText(this, "onbackpressd()", Toast.LENGTH_SHORT).show();
            Log.v("ceshi", "systemtime:" + System.currentTimeMillis() + "; time" + time);
        }
    }

    @Override
    public void onClick(View v) {
        FirstClass firstClass = new FirstClass();
        firstClass.dianji("");
        firstClass.wucan();
        firstClass.checkNUll(1);
        Log.v("ceshi", "firstclass" + firstClass.dianji("ceshi"));
        Snackbar snackbar = Snackbar.make(v, "hhah", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
