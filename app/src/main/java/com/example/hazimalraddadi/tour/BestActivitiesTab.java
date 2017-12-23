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

public class BestActivitiesTab extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.best_activities_tab, container, false);
        ArrayList<Locations>  locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.londonbridge,R.string.london_bridgeName,R.string.london_bridge) );
        locations.add(new Locations(R.drawable.madame,R.string.madame_tussaudsName,R.string.madame_tussauds) );
        locations.add(new Locations(R.drawable.londoneye,R.string.london_eyeName, R.string.london_eye));
        ListAdapter listAdapter = new ListAdapter(getContext() , locations) ;
        ListView listView = (ListView) view.findViewById(R.id.bestActivities_lv) ;
        listView.setAdapter(listAdapter);
        return view;
    }


}
