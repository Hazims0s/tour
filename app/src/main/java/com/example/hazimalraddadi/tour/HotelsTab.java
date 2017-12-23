package com.example.hazimalraddadi.tour;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsTab extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_hotels_tab, container, false);
        ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.drawable.the_lanesborough,R.string.TheLanesboroughName,R.string.TheLanesborough) );
        locations.add(new Locations(R.drawable.the_beaumont,R.string.TheBeaumontName,R.string.TheBeaumont) );
        locations.add(new Locations(R.drawable.corinthia_hotel,R.string.CorinthiaHotelLondonName,R.string.CorinthiaHotelLondon) );
        ListAdapter listAdapter = new ListAdapter(getContext() , locations) ;
        ListView listView = (ListView) view.findViewById(R.id.hotels_lv) ;
        listView.setAdapter(listAdapter);
        return view;}
}
