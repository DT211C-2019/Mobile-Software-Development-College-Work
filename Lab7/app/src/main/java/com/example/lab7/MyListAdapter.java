package com.example.lab7;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] monthName;
    private final String[] monthNumber;


    public MyListAdapter(Activity context, String[] monthName, String[] monthNumber) {
        super(context, R.layout.mylist, monthName);

        this.context=context;
        this.monthName = monthName;
        this.monthNumber = monthNumber;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView monthNameText = (TextView) rowView.findViewById(R.id.monthName);
        TextView monthNumberText = (TextView) rowView.findViewById(R.id.monthNumber);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        monthNameText.setText(monthName[position]);
        monthNumberText.setText(monthNumber[position]);

        if (monthName[position].equals("December")){
            imageView.setImageResource(R.drawable.ok);
        } else {
            imageView.setImageResource(R.drawable.xmark);
        }

        return rowView;

    };
}