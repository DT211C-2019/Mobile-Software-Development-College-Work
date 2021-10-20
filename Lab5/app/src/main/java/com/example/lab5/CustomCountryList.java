package com.example.lab5;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomCountryList extends ArrayAdapter {
    private String[] countryNames;
    private String[] capitalNames;
    private Integer[] imageid;
    private Activity context;
    public CustomCountryList(Activity context, String[]
            countryNames, String[] capitalNames, Integer[] imageid) {
        super(context, R.layout.row_item, countryNames);
        this.context = context;
        this.countryNames = countryNames;
        this.capitalNames = capitalNames;
        this.imageid = imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup
            parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewCountry = (TextView)
                row.findViewById(R.id.textViewCountry);
        TextView textViewCapital = (TextView)
                row.findViewById(R.id.textViewCapital);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.imageViewFlag);
        textViewCountry.setText(countryNames[position]);

        textViewCapital.setText(capitalNames[position]);

        textViewCapital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(), "You " + "Selected " + capitalNames[position] + " as Capital", Toast.LENGTH_SHORT).show();
            }
        });

        textViewCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(), "You " + "Selected " + countryNames[position] + " as Country", Toast.LENGTH_SHORT).show();
            }
        });

        imageFlag.setImageResource(imageid[position]);

        imageFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DisplayInfo.class);
                Bundle b = new Bundle();
                b.putString("city", capitalNames[position]); //Your id
                b.putString("country", countryNames[position]); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                context.startActivity(intent); // Start the new activity
            }
        });


        return row;
    }
}