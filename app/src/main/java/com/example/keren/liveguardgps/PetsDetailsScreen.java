package com.example.keren.liveguardgps;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import VO.PetsClass;
import VO.UserDetailsClass;

public class PetsDetailsScreen extends AppCompatActivity {

    ArrayList<PetsClass> petsClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets_details);
        petsClasses = new ArrayList<>();

        EditText user_phone = (EditText)findViewById(R.id.user_phone);
        EditText user_name = (EditText)findViewById(R.id.user_name);
        EditText user_age = (EditText)findViewById(R.id.user_age);
        EditText user_description = (EditText)findViewById(R.id.user_description);


        Button save_details = (Button)findViewById(R.id.save_details);
        save_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserDetailsClass userDetailsClass = new UserDetailsClass();
              //  userDetailsClass.setPetsClasses();
            }
        });



        // get all the data from feilds after save button clicked
        // popup Do you want enter more pets?
        //enter to current user in DB
        //yes clear all the fields new enter details
        // no

    }

    private void popupDialog(){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(getBaseContext());
        builder.setTitle("Delete entry")
                .setMessage("Are you sure you want to delete this entry?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

}
