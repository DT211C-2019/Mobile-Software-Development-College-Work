package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DisplayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        // Read the variables from the bundle
        Bundle b = getIntent().getExtras();
        String city = b.getString("city");
        String country = b.getString("country");


        // Link our widget to the variables
        TextView display_country = (TextView) findViewById(R.id.display_country);
        TextView display_city = (TextView) findViewById(R.id.display_city);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String escapedQuery = null;
                try {
                    escapedQuery = URLEncoder.encode((country + city), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Uri uri = Uri.parse("http://www.google.com/#q=" + escapedQuery);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Display the values on the screen
        display_country.setText(country);
        display_city.setText(city);
    }
}
