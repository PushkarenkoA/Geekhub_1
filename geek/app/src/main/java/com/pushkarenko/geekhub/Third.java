package com.pushkarenko.geekhub;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pushkarenko.geekhub.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class Third extends AppCompatActivity implements View.OnClickListener {

    Button btn_3_1;
    Button btn_3_2;
    Button btn_3_3;
    Button btn_3_4;
    TextView tv_3_1;
    TextView tv_3_2;

    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile" };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        btn_3_1 = (Button)findViewById(R.id.btn_3_1);
        btn_3_1.setOnClickListener(this);
        btn_3_2 = (Button) findViewById(R.id.btn_3_2);
        btn_3_2.setOnClickListener(this);
        btn_3_3 = (Button) findViewById(R.id.btn_3_3);
        btn_3_3.setOnClickListener(this);
        btn_3_4 = (Button) findViewById(R.id.btn_3_4);
        btn_3_4.setOnClickListener(this);
        tv_3_1 = (TextView) findViewById(R.id.tv_3_1);

        tv_3_1.setText(TextUtils.join(",",Arrays.asList(values)));
        tv_3_2 = (TextView) findViewById(R.id.tv_3_2);
    }



    public void revers(){

        ArrayList<String> list =  new ArrayList<>(Arrays.asList(values));
        Collections.reverse(list);
        tv_3_2.setText(TextUtils.join(",",list));
    }
    public void remove3(){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));

        for (int i = 1; i<=list.size(); i++){

            if (i%3 ==0){
                list.remove(i);
            }
            tv_3_2.setText(TextUtils.join(", ",list));
        }
    }
    public  void  removeD(){
        List<String> list = new ArrayList<>(new HashSet(Arrays.asList(values)));
        tv_3_2.setText(TextUtils.join(", ",list));

    }
    public void sort(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        Collections.sort(list);
        tv_3_2.setText(TextUtils.join(", ",list));

    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_3_1:
                revers();
                break;
            case R.id.btn_3_2:
                remove3();
                break;
            case R.id.btn_3_3:
                removeD();
                break;
            case R.id.btn_3_4:
                sort();
                break;
        }

    }

}