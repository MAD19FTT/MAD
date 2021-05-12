package com.example.android.tasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void countUp(View view){
        num++;
        TextView counts = (TextView) findViewById(R.id.count);
        counts.setText(num);
    }

    public void pressCount(View view){
        num++;
        TextView counts = (TextView) findViewById(R.id.count);
        counts.setText(num);
    }

}
