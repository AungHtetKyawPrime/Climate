package com.example.climate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.climate.RecyWaste.FactoryWaste;
import com.example.climate.RecyWaste.HomeWaste;

public class TabAdapter extends FragmentStatePagerAdapter {
    int NumOfTabs;
    public TabAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeWaste tab1 = new HomeWaste();
                return tab1;
            case 1:
                FactoryWaste tab2 = new FactoryWaste();
                return tab2;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }
}
