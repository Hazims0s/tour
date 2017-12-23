package com.example.hazimalraddadi.tour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hazimalraddadi on 12/21/17.
 */

public class RestaurantsTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.restaurants_tab, container, false);
        ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.xi_an,R.string.XianImpressionName,R.string.XianImpression) );
        locations.add(new Locations(R.drawable.franco,R.string.PFrancoName,R.string.PFranco) );
        locations.add(new Locations(R.drawable.mangal,R.string.mangalName,R.string.mangal) );
        ListAdapter listAdapter = new ListAdapter(getContext() , locations) ;
        ListView listView = (ListView) view.findViewById(R.id.restaurant_lv) ;
        listView.setAdapter(listAdapter);
        return view;
    }
}
