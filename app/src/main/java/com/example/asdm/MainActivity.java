package com.example.asdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Results results;
    EditText t1,t2;
    Button b1,b2,b3,b4;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        results = new Results();
        getSupportFragmentManager().beginTransaction().replace(R.id.resultfragment,results).commit();
        t1 = findViewById(R.id.num1);
        t2 = findViewById(R.id.num2);
        b1 = findViewById(R.id.addbtn);
        b2 = findViewById(R.id.subbtn);
        b3 = findViewById(R.id.mulbtn);
        b4 = findViewById(R.id.divbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                results.showData(String.valueOf(a+b));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                results.showData(String.valueOf(a-b));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                results.showData(String.valueOf(a*b));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                results.showData(String.valueOf(a/b));
            }
        });
    }
    public void setData(){
        a = Integer.parseInt(String.valueOf(t1.getText()));
        b = Integer.parseInt(String.valueOf(t2.getText()));
    }
}