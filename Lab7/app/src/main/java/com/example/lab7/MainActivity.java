package com.example.lab7;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.lab7.MESSAGE";

    ListView list;

    String[] monthName ={
            "January",
            "February",
            "March",
            "April",
            "May",
            "june",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
    };

    String[] monthNumber ={
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, monthName, monthNumber);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, DisplayMonth.class);
            intent.putExtra(EXTRA_MESSAGE, monthName[position]);
            startActivity(intent);
        });
    }
}