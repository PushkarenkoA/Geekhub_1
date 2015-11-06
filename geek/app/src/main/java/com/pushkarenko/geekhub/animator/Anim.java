package com.pushkarenko.geekhub.animator;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pushkarenko.geekhub.R;


public class Anim extends Activity implements Animation.AnimationListener {
    TextView img;
    Button btn5_1;
    Button btn5_2;
    Button btn5_3;
    Button btn5_4;
    Animation anim;
    Animation anim2;
    Animation anim3;
    Animation anim4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_anim);
        img = (TextView) findViewById(R.id.tv5_1);
        btn5_1 = (Button) findViewById(R.id.btn5_1);
        btn5_2 = (Button) findViewById(R.id.btn5_2);
        btn5_3 = (Button) findViewById(R.id.btn5_3);
        btn5_4 = (Button) findViewById(R.id.btn5_4);


        btn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });
        btn5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim2);

            }
        });
        btn5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim3);

            }
        });
        btn5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim4);

            }
        });


        anim = AnimationUtils.loadAnimation(this,R.anim.anim);
        anim.setAnimationListener(this);
        anim2 = AnimationUtils.loadAnimation(this,R.anim.anim2);
        anim2.setAnimationListener(this);
        anim3 = AnimationUtils.loadAnimation(this,R.anim.anim3);
        anim3.setAnimationListener(this);
        anim4 = AnimationUtils.loadAnimation(this,R.anim.anim4);
        anim4.setAnimationListener(this);
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


    }
