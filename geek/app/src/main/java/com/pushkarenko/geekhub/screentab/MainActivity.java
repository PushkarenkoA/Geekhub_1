package com.pushkarenko.geekhub.screentab;

import android.content.Intent;
import android.os.Bundle;


import android.support.v4.app.FragmentActivity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.pushkarenko.geekhub.R;


/**
 * Created by Маряна on 11.11.2015.
 */
public class MainActivity extends FragmentActivity implements
        com.pushkarenko.geekhub.screentab.TitlesFragment.onItemClickListener {


    private Toolbar supportActionBar;

    int position = 0;
    boolean withDetails = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab);
        supportActionBar = (Toolbar) findViewById(R.id.mytoolbar);
        supportActionBar.setNavigationIcon(R.drawable.ic_action_back);
        supportActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        if (savedInstanceState != null)
            position = savedInstanceState.getInt("position");
        withDetails = (findViewById(R.id.cont) != null);
        if (withDetails)
            showDetails(position);
    }

    void showDetails(int pos) {
        if (withDetails) {
            DetailsFragment details = (DetailsFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.cont);
            if (details == null || details.getPosition() != pos) {
                details = DetailsFragment.newInstance(pos);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.cont, details).commit();
            }
        } else {
            startActivity(new Intent(this, DetailsActivity.class).putExtra("position", position));
        }
    }

    @Override
    public void itemClick(int position) {
        this.position = position;
        showDetails(position);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", position);
    }



}