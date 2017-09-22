package com.maanondev.docuumentsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.CheckedInputStream;

public class find_document extends AppCompatActivity {

    public EditText your_name;
    public EditText father_name;
    public EditText dob;
    public Button search;
    public TextView out_put;
    DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_document);

        final FirebaseDatabase Database=FirebaseDatabase.getInstance();
        myRef=Database.getReferenceFromUrl("https://docuumentsearch.firebaseio.com/document_reg/");




        your_name= (EditText) findViewById(R.id.your_name);
        father_name= (EditText) findViewById(R.id.father_name);
        dob= (EditText) findViewById(R.id.dob);

        out_put= (TextView) findViewById(R.id.out_put);

        search= (Button) findViewById(R.id.search);

       /* search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckData();
            }
        });*/
        /*search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database.getReference("8475848069").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String value=dataSnapshot.getValue(String.class);
                        System.out.println(value);
                       // out_put.setText(value);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });*/



       /* search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String passcode=your_name.getText().toString().trim();
                myRef.child("Hoder's Name").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String value=dataSnapshot.getValue(String.class);
                        System.out.println(value);

                        if (passcode.equals(value)) {
                            String ans=dataSnapshot.getValue(String.class);
                            System.out.println(ans);
                        }else if (!passcode.equals(value)) {
                            System.out.println("Try Again");
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });*/

        /*search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String passcode=your_name.getText().toString().trim();
                myRef.child("Holder's Name").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        HashMap<String,String> value=dataSnapshot.getValue(HashMap.class);
                        System.out.println(value);

                        if (passcode.equals(value)) {
                            HashMap<String,String> ans=dataSnapshot.getValue(HashMap.class);
                            System.out.println(ans);
                        }else if (!passcode.equals(value)) {
                            System.out.println("Try Again");
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });*/

        /*search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String passcode=your_name.getText().toString().trim();

                myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String holder_name=dataSnapshot.getValue(String.class);
                        System.out.println(holder_name);


                        if (passcode.equals(holder_name)) {
                            String value=dataSnapshot.getValue(String.class);
                            System.out.println(holder_name);
                            out_put.setText(value);

                        } else if (!passcode.equals(holder_name)) {
                            System.out.println("Try again");
                            out_put.setText("Try Again");

                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });*/


    }

   /* private void CheckData() {
        final String hn=your_name.getText().toString().trim();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.equals(hn)){
                    System.out.println("yes i am");
                } else {
                    System.out.println("OMG");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }*/


}
