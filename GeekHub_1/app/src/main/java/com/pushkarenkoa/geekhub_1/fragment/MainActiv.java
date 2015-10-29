package com.pushkarenkoa.geekhub_1.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.pushkarenkoa.geekhub_1.R;

/**
 * Created by Маряна on 28.10.2015.
 */
public class MainActiv extends BaseActivity implements  Show {


    FragmentTransaction tr = getFragmentManager().beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean isAddFragment() {
        return true;
    }

    @Override
    public void addFragment() {
        tr.add(R.id.container, new MainF() ).commit();
    }

    @Override
    public void showPrevious() {
        FragmentTransaction fragmentTransaction = getFragmentManager()
                .beginTransaction();
        fragmentTransaction.replace(R.id.container,new FragSec()).commit();
    }

    @Override
    public void showNext() {

        FragmentTransaction fragmentTransaction = getFragmentManager()
                .beginTransaction();
        fragmentTransaction.replace(R.id.container,new NextF()).commit();


    }

}
