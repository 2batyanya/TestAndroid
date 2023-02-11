package ru.eltex.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one =(Button) findViewById(R.id.one);
        one.setOnClickListener((view) -> {
            ((TextView) findViewById(R.id.output)).setText("1");
        });
    }
}