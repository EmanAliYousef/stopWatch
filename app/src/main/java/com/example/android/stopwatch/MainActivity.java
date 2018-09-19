package com.example.android.stopwatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start (View view){
       a=a + 1;
       display(a);

    }



    private void display(int number) {
        TextView TextView = (TextView) findViewById(R.id.text);
        TextView.setText("" + number);
    }


        public void stop (View view){
        int a =0;
        display(a);

        }


    public void reset(View view) {

        a = 0;
        display(a);
    }
}