package com.pushkarenko.geekhub.animator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pushkarenko.geekhub.R;


public class Anim extends Activity implements Animation.AnimationListener,View.OnClickListener {
    TextView img;
    Button btn5_1;
    Button btn5_2;
    Button btn5_3;
    Button btn5_4;
    Animation anim;
    Animation anim2;
    Animation anim3;
    Animation anim4;

    Toolbar supportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_anim);
        img = (TextView) findViewById(R.id.tv5_1);
        btn5_1 = (Button) findViewById(R.id.btn5_1);
        btn5_2 = (Button) findViewById(R.id.btn5_2);
        btn5_3 = (Button) findViewById(R.id.btn5_3);
        btn5_4 = (Button) findViewById(R.id.btn5_4);
        btn5_1.setOnClickListener(this);
        btn5_2.setOnClickListener(this);
        btn5_3.setOnClickListener(this);
        btn5_4.setOnClickListener(this);


        anim = AnimationUtils.loadAnimation(this,R.anim.anim);
        anim.setAnimationListener(this);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.anim2);
        anim2.setAnimationListener(this);
        anim3 = AnimationUtils.loadAnimation(this,R.anim.anim3);
        anim3.setAnimationListener(this);
        anim4 = AnimationUtils.loadAnimation(this,R.anim.anim4);
        anim4.setAnimationListener(this);

        supportActionBar = (Toolbar) findViewById(R.id.mytoolbar);
        supportActionBar.setNavigationIcon(R.drawable.ic_action_back);
        supportActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn5_1:
                img.startAnimation(anim);
                break;
            case R.id.btn5_2:
                img.startAnimation(anim2);
                break;
            case R.id.btn5_3:
                img.startAnimation(anim3);
                break;
            case R.id.btn5_4:
                img.startAnimation(anim4);
                break;

        }
    }
}
