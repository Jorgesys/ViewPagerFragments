package com.jorgesys.fragmentsinviewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jorgesys on 6/15/166.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {


     Context context;

    public TabsPagerAdapter(FragmentManager fm, Context context) {

        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count (number of tabs)
        return 3;
    }


}