package com.example.wangweijun.productflavorsdemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.mylibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.print();

        Toast.makeText(getApplicationContext(), "qiku abroad", Toast.LENGTH_SHORT).show();
        com.example.lib2.Utils.print();
    }
}
