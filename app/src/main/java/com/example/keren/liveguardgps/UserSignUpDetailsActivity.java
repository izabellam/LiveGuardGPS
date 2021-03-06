package com.example.keren.liveguardgps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import VO.UserDetailsClass;
import utils.ConstantsClass;

/**
 * Created by Keren on 11/01/2018.
 */

public class UserSignUpDetailsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);


        final EditText user_login_pswd = (EditText) findViewById(R.id.user_login_pswd);
        final EditText user_login_email = (EditText)findViewById(R.id.user_login_email);


        Button save_user_details = (Button) findViewById(R.id.save_user_details);
        save_user_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userpswd = user_login_pswd.getText().toString();
                String user_email_str = user_login_email.getText().toString();

                saveDataToDB(user_email_str);
                // go to database save user

                Intent i = new Intent(UserSignUpDetailsActivity.this, MapsActivity.class);
                startActivity(i);

            }
        });







    }

    private Firebase mRootRef;
    private void saveDataToDB(String email){
        mRootRef = new Firebase(ConstantsClass.FIRE_BASE_URL);
        String emailMain = email.replaceAll("@", "").replaceAll(".","");
        System.out.println("Keren email = " + emailMain);
        Firebase userRef = mRootRef.child(emailMain);
        UserDetailsClass userDetailsClass = new UserDetailsClass();
        userDetailsClass.setUserEmail(email);


        userRef.setValue(userDetailsClass);


    }

}
