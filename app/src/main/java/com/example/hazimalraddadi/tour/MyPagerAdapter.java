package com.example.hazimalraddadi.tour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hazimalraddadi on 12/21/17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override

    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                BestActivitiesTab bestActivitiesTab = new BestActivitiesTab();
                return bestActivitiesTab;
            case 1:
                RestaurantsTab restaurantsTab = new RestaurantsTab();
                return restaurantsTab;
            case 2:
                ShopsTab shopsTab = new ShopsTab();
                return shopsTab;
            case 3:
                HotelsTab hotelsTab = new HotelsTab();
                return hotelsTab;
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}
