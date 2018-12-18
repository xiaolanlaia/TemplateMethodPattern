package com.example.templatemethodpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
