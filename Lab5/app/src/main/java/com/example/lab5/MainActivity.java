package com.example.lab5;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String countryNames[] = {
            "India",
            "China",
            "Nepal",
            "Bhutan"
    };
    private String capitalNames[] = {
            "Delhi",
            "Beijing",
            "Kathmandu",
            "Thimphu"
    };
    private Integer imageid[] = {
            R.drawable.india,
            R.drawable.china,
            R.drawable.nepal,
            R.drawable.bhutan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("List of Countries");
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(textView);

        // For populating list data
        CustomCountryList customCountryList = new CustomCountryList(this, countryNames, capitalNames, imageid);
        listView.setAdapter(customCountryList);

    }
}