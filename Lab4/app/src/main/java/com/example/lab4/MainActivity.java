package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView country_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_list = (ListView) findViewById(R.id.country_list);

        ArrayList <String> city_array = new ArrayList<>();

        city_array.add("Shanghai");
        city_array.add("Dublin");
        city_array.add("Berlin");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, city_array);

        country_list.setAdapter(adapter);

        country_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You have clicked in " + i,Toast.LENGTH_SHORT).show();

                // This mechanism allows you to call open a new activity in your screen
                Intent intent = new Intent(MainActivity.this, DisplayInfo.class);

                // Bundle is the android mechanism to pass parameter to other activity
                Bundle b = new Bundle();
                b.putString("city", "Shanghai"); //Your id
                b.putString("country", "China"); //Your id
                b.putInt("city_population", 24153000);
                b.putInt("metro_population", 34000000);

                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent); // Start the new activity

            }
        });
    }
}