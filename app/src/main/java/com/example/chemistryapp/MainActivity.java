package com.example.chemistryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Create user interface for Main page of the application
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);

        title.setText("ChemistryApp");

        //need to pull api for description
        description.setText("Description");

        Button button = findViewById(R.id.mainButton);

        //move to next page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, TopicList.class);
                startActivity(myIntent);
            }
        });

    }
}