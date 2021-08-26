package com.example.chemistryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Initialize list of buttons through Recycle View
 */
public class TopicList extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        //creating view & populating recycler view
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        String[] string;
        CustomAdapter customAdapter = new CustomAdapter(string);

        recyclerView.setAdapter(customAdapter);

        //todo: allow recycle view item clickable
        Button button = findViewById(R.id.playersButton);

        //move to responding page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TopicList.this, Chapter.class);
                startActivity(myIntent);
            }
        });

    }
}
