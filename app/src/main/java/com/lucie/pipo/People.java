package com.lucie.pipo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.ui.FirebaseRecyclerViewAdapter;

import java.util.List;

public class People extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_people); //the one with recycler view

        Firebase myFbRef = new Firebase("https://mydatavisualize.firebaseio.com/");


        /*myFbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                //Log.d("dataforall", "data"+dataSnapshot.getValue());
                Log.d("dataforall", "count:" + dataSnapshot.getChildrenCount());
                for (DataSnapshot postSnapShot : dataSnapshot.getChildren()) {
                    PeopleDetails pDetails = postSnapShot.getValue(PeopleDetails.class);
                    Log.d("datafor1", "" + pDetails.getid());
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Log.d("data for 1", firebaseError.getMessage());
            }
        });*/

        //this is where we will be populating our data
        RecyclerView rv = (RecyclerView) findViewById(R.id.people_recycler);

        //added features for the recycler view
        rv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        //adapter linking
        PeopleAdapter peopleAdapter = new PeopleAdapter(PeopleDetails.class, R.layout.people_item,PeopleViewHolder.class,myFbRef);

        rv.setAdapter(peopleAdapter);


    }

}
