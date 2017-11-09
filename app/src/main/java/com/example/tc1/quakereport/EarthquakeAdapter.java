package com.example.tc1.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TC1 on 07/11/2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthquake  = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in the TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Display the location of the current earthquake in the TextView
        locationView.setText(currentEarthquake.getLocation());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in the TextView
        dateView.setText(currentEarthquake.getDate());

        // Return the listItemView that is now showing the appropriate date
        return listItemView;
    }
}
