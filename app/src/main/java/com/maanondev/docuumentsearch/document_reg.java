package com.maanondev.docuumentsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class document_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_reg);

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference myRef=database.getReferenceFromUrl("https://docuumentsearch.firebaseio.com/document_reg/");


        final EditText holder_name= (EditText) findViewById(R.id.holder_name);
        final EditText holder_fname= (EditText) findViewById(R.id.holder_fname);
        final EditText holder_dob= (EditText) findViewById(R.id.holder_dob);
        final EditText finder_name= (EditText) findViewById(R.id.finder_name);
        final EditText mobile_no= (EditText) findViewById(R.id.mobile_no);
        Button submit_d= (Button) findViewById(R.id.submit_d);

        submit_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child(mobile_no.getText().toString()).child("Holder's Name").setValue(holder_name.getText().toString());
                myRef.child(mobile_no.getText().toString()).child("Holder's Fname").setValue(holder_fname.getText().toString());
                myRef.child(mobile_no.getText().toString()).child("Holder's DOB").setValue(holder_dob.getText().toString());
                myRef.child(mobile_no.getText().toString()).child("Finder's Name").setValue(finder_name.getText().toString());
            }
        });
    }
}
