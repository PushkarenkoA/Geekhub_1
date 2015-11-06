package com.pushkarenko.geekhub.fragment;


import android.os.Bundle;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;

import com.pushkarenko.geekhub.R;


public abstract class BaseActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conteiner);

        if (isAddFragment() && (savedInstanceState == null)) {
            addFragment();
        }
    }

    public abstract boolean isAddFragment();
    public abstract void addFragment();

}
