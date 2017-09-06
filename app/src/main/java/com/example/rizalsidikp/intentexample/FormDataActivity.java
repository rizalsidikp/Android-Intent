package com.example.rizalsidikp.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by rizalsidikp on 06/09/17.
 */

public class FormDataActivity extends AppCompatActivity {

    EditText fName, lName;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_data_screen);

        fName = (EditText) findViewById(R.id.firstname);
        lName = (EditText) findViewById(R.id.lastname);

        sendButton = (Button) findViewById(R.id.sendbutton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FormDataActivity.this, WithParameterActivity.class);
//                disini set parameter nya
                i.putExtra("FirstName", fName.getText().toString()); // parameter pertama adalah key nya, parameter ke dua adalah value nya
                i.putExtra("LastName", lName.getText().toString()); //.getText().toString() ngambil value string dari yg di input
                startActivity(i);
            }
        });
    }
}
