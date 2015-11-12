package com.pushkarenko.geekhub.screentab;

/**
 * Created by Маряна on 11.11.2015.
 */
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pushkarenko.geekhub.R;
import com.pushkarenko.geekhub.screentab.DetailsFragment;

public class DetailsActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            DetailsFragment details = DetailsFragment.newInstance(getIntent().getIntExtra("position", 0));
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }

    }
}