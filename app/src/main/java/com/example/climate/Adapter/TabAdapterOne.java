package com.example.climate.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.climate.RecyWaste.FactoryRecy;
import com.example.climate.RecyWaste.HomeRecy;

public class TabAdapterOne extends FragmentStatePagerAdapter {
    int NumOfTabs;
    public TabAdapterOne(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeRecy tab1 = new HomeRecy();
                return tab1;
            case 1:
                FactoryRecy tab2 = new FactoryRecy();
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
