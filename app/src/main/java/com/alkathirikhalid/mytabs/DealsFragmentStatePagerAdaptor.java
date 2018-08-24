package com.alkathirikhalid.mytabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Project MyTabs
 * Date: 8/22/2018 Time: 1:32 AM
 *
 * @author alkathirikhalid
 */

public class DealsFragmentStatePagerAdaptor extends FragmentStatePagerAdapter {
    public DealsFragmentStatePagerAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return DealsFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
