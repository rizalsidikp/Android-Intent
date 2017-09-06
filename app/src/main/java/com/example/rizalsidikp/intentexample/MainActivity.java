package com.example.rizalsidikp.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button withParam, withoutParam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        withoutParam = (Button) findViewById(R.id.withoutparambtn);
        withParam = (Button) findViewById(R.id.withparambtn);

        withoutParam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, WithoutParameterActivity.class);
                startActivity(i);
            }
        });

        withParam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FormDataActivity.class);
                startActivity(i);
            }
        });
    }
}
