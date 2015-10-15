package com.pushkarenkoa.geekhub_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Second extends AppCompatActivity {
    EditText edt;
    TextView view2;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        edt = (EditText) findViewById(R.id.edt);
        view2 = (TextView) findViewById(R.id.text);

        btn1 = (Button) findViewById(R.id.fib);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2.setText(String.valueOf(fibshow(Integer.parseInt(edt.getText().toString()))));

            }
        });
        btn2 = (Button)findViewById(R.id.fac);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2.setText(String.valueOf(fact(Integer.parseInt(edt.getText().toString()))));
            }
        });
    }
    public static long fibshow(int n){
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibshow(n - 1) + fibshow(n - 2);
    }
    public static long fact(int n){
        if (n == 0) return 1;
        return n * fact(n-1);
    }

}


