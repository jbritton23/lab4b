package com.example.lab4b;

import android.support.v4.app.*;


public class TabPageAdapter extends FragmentPagerAdapter {
    int tabCount;

    public TabPageAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new TipCalculator();
            case 1:
                return new DistanceConverter();
            case 2:
                return new TempConverter();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }}

