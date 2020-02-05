package com.mutinda.fragment2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public TextView tv1;
    public TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.text);
        tv2 = findViewById(R.id.text2);
//the if block is useful as it prevents the fragments fom overlapping.
        if (findViewById(R.id.container) != null){

            if (savedInstanceState != null)
            {
                return;}
//the getSupportFragmentManager() is different from getFragmentManager() since it can been used with older versions of API
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        fragmentTransaction.add(R.id.container, firstFragment, null);
        fragmentTransaction.commit();


    }}}
