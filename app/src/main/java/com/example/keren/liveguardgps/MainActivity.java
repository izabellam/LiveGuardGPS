package com.example.keren.liveguardgps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Thread.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail_pswd_layout);


        EditText user_email = (EditText) findViewById(R.id.user_email);

   /*     EditText user_pswd = (EditText) findViewById(R.id.user_pswd);

        Button enter_app = (Button)findViewById(R.id.enter_app);
        enter_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });

        Button register_app = (Button)findViewById(R.id.register_app);
        register_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UserDetailsActivity.class);
                startActivity(i);
            }
        }); */




    }
}
