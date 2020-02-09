package com.gahlot.fragments101.FragmentsStatePagerAdapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gahlot.fragments101.DynamicFragments.FirstFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private Context mContext;
    private String[] tabTitles = {"TAB 1","TAB 2","TAB 3"};

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                FirstFragmentPageAdapter fragment1 = new FirstFragmentPageAdapter();
                return fragment1;

            case 1:
                SecondFragmentPageAdapter fragment2 = new SecondFragmentPageAdapter();
                return  fragment2;

            case 2:
                return new ThirdFragmentPageAdapter();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
