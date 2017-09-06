package com.example.rizalsidikp.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by rizalsidikp on 06/09/17.
 */

public class WithParameterActivity extends AppCompatActivity {

    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.with_param_screen);

        hasil = (TextView) findViewById(R.id.hasil);
//      ini buat ngambil parameter dari Intent yg di kirim dari form data
        Intent i = getIntent();
//      boleh dimasukan ke string atau langsung di tampilkan, disini contohnya dimasukin string
        String getFirstName = i.getStringExtra("FirstName"); //"FirstName" ini diambil dari key yg dikirim dari form data
        String getLastName = i.getStringExtra("LastName");
//      set ke textview
        hasil.setText("Your Name is : " + getFirstName + " " + getLastName);
    }
}
