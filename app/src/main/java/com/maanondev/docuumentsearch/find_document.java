package com.maanondev.docuumentsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class find_document extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_document);

        final FirebaseDatabase Database=FirebaseDatabase.getInstance();
        DatabaseReference myRef=Database.getReferenceFromUrl("https://docuumentsearch.firebaseio.com/document_reg/");

        EditText your_name= (EditText) findViewById(R.id.your_name);
        EditText father_name= (EditText) findViewById(R.id.father_name);
        EditText dob= (EditText) findViewById(R.id.dob);

        TextView out_put= (TextView) findViewById(R.id.out_put);

        Button search= (Button) findViewById(R.id.search);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Database.getReference("document_reg").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {


                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
    }
}
