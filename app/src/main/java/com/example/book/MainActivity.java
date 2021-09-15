package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }


    public void addListenerOnButton() {
        TextView lesson1 = (TextView) findViewById(R.id.textView1);
        TextView lesson2 = (TextView) findViewById(R.id.textView2);
        TextView lesson3 = (TextView) findViewById(R.id.textView3);
        lesson1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".lesson1");
                        startActivity(intent);
                    }
                }
        );
        lesson2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".lesson2");
                        startActivity(intent);
                    }
                }
        );
        lesson3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".lesson3");
                        startActivity(intent);
                    }
                }
        );


    }
}
