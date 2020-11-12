package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case  R.id.fragment1 :
                //Ce que tu veux faire lorsque tu cliques sur le bouton 1
                frgment fragment = new frgment();
                fragmentTransaction.add(R.id.linearLayout, fragment);
                fragmentTransaction.commit();
                break;

            case R.id.fragment2 :
                //Ce que tu veux faire lorsque tu cliques sur le bouton 2
                fragment2 fragment2 = new fragment2();
                fragmentTransaction.replace(R.id.linearLayout, fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
        }
    }*/


    public void button(View view) {
        //Intent intent = new Intent(this, frgment.class) ;
        //startActivity(intent);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        frgment fragment = new frgment();
        fragmentTransaction.add(R.id.linearLayout, fragment);
        fragmentTransaction.commit();
    }

    public void button2(View view) {
        //Intent intent = new Intent(this, frgment.class) ;
        //startActivity(intent);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment2 fragment2 = new fragment2();
        //fragmentTransaction.remove(R.id.linearLayout, fragment2);
        fragmentTransaction.replace(R.id.linearLayout, fragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}