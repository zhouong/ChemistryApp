package com.example.chemistryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Initialize list of buttons through Recycle View
 */
public class TopicList extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        //bring in api
        String[] dataSet;
        CustomAdapter customAdapter(dataSet);

        //creating view & populating recycler view
        customAdapter.onCreateViewHolder(viewgroup, int);

        //set for button to function accordingly
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
