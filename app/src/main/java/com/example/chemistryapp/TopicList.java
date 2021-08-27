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

        //todo: call api here
        String[] string;
        CustomAdapter customAdapter = new CustomAdapter(string);

        recyclerView.setAdapter(customAdapter);

        //todo: respond to the onclick
        TextView button = findViewById(R.id.editText);

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
