package com.example.hazimalraddadi.tour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hazimalraddadi on 12/21/17.
 */

public class ListAdapter extends ArrayAdapter<Locations> {
    public ListAdapter(@NonNull Context context, ArrayList<Locations> locations) {
        super(context, 0,locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_template, parent, false);
        }
        Locations locations = getItem(position);
        ImageView locationImgview = (ImageView) listItemView.findViewById(R.id.locationImageView) ;
        TextView locationNameTxtview =(TextView) listItemView.findViewById(R.id.NameTxtview);
        TextView locationAboutTxtview =(TextView) listItemView.findViewById(R.id.aboutTxtview);
        locationNameTxtview.setText(locations.getName());
        locationAboutTxtview.setText(locations.getAbout());
        locationImgview.setImageResource(locations.getLocationPicture());
        return listItemView;
    }

}
