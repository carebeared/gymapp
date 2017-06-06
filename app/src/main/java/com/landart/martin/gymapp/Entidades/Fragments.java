package com.landart.martin.gymapp.Entidades;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.landart.martin.gymapp.R;

public abstract class Fragments extends FragmentActivity {

    protected abstract android.support.v4.app.Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.container, fragment).commit();
        }
    }
}
