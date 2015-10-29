package com.pushkarenkoa.geekhub_1.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pushkarenkoa.geekhub_1.R;

/**
 * Created by Маряна on 28.10.2015.
 */
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