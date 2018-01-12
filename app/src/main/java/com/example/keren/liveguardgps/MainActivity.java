package com.example.keren.liveguardgps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import utils.ConstantsClass;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail_pswd_layout);

        //remember me logic

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl(ConstantsClass.FIRE_BASE_URL);
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        // Firebase connection email main id, save email main id and all the pets
        // List of pets, Pets class
        // google maps show pets location
        // screen adding new pets to app, add image
        // screen user profile , change settings

        //HW
        //dimens
        // beutifull screens

       final EditText user_email = (EditText) findViewById(R.id.user_email);

        final EditText user_pswd = (EditText) findViewById(R.id.user_pswd);

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

                Intent i = new Intent(MainActivity.this, UserSignUpDetailsActivity.class);
                startActivity(i);
            }
        });

    }


}
