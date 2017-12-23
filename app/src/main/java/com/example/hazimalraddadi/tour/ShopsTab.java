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

public class ShopsTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shops_tab, container, false);
        ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.westfield,R.string.westfieldName,R.string.westfield) );
        locations.add(new Locations(R.drawable.harrods,R.string.HarrodsName,R.string.Harrods) );
        locations.add(new Locations(R.drawable.selfridges,R.string.SelfridgesName,R.string.Selfridges) );
        ListAdapter listAdapter = new ListAdapter(getContext() , locations) ;
        ListView listView = (ListView) view.findViewById(R.id.shops_lv) ;
        listView.setAdapter(listAdapter);
        return view;
    }
}
