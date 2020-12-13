package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int points = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3(View view) {
    points = points + 3;
    display(points);
    }
    private void display(int points){
    TextView addy =(TextView) findViewById(R.id.addy);
    addy.setText(" " +points);

    }

    public void add1(View view) {
    points= points + 1;
    displ(points);
    }
    private void displ(int points){
    TextView addy =(TextView) findViewById(R.id.addy);
        addy.setText(" " +points);
    }

    public void add2(View view) {
    points = points + 2;
    disp(points);
    }
    private void disp(int points){
    TextView addy = (TextView) findViewById(R.id.addy);
        addy.setText(" " +points);
    }

    public void athree(View view) {
        points=points + 3;
        show(points);
    }
    private void show(int points){
        TextView poin=(TextView) findViewById(R.id.poin);
        poin.setText(" " + points);
    }

    public void aone(View view) {
        points=points + 1;
        sho(points);
    }
    private void sho(int points){
        TextView poin = (TextView) findViewById(R.id.poin);
        poin.setText(" " +points);
    }

    public void atwo(View view) {
        points=points +2;
        sh(points);
    }
    private void sh(int points){
        TextView poin =(TextView) findViewById(R.id.poin);
        poin.setText(" " +points);
    }

}