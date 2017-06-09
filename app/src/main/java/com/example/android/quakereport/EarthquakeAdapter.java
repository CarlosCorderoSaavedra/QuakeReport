package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carlos.cordero on 9/6/17.
 */

public class EarthquakeAdapter extends ArrayAdapter <Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> Earthquake) {
        super(context, 0, Earthquake);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake= getItem(position);

        TextView earthquakeMagnitude = (TextView) convertView.findViewById(R.id.magnitude);
        earthquakeMagnitude.setText(currentEarthquake.getMagnitude());

        TextView earthquakeLocation = (TextView) convertView.findViewById(R.id.location);
        earthquakeLocation.setText(currentEarthquake.getLocate());

        TextView earthquakeDate = (TextView) convertView.findViewById(R.id.date);
        earthquakeDate.setText(currentEarthquake.getDate());

        return convertView;
    }
}
