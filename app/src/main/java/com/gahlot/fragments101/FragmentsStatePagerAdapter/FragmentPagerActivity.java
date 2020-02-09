package com.gahlot.fragments101.FragmentsStatePagerAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import com.gahlot.fragments101.R;
import com.google.android.material.tabs.TabLayout;

public class FragmentPagerActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;

    private CoordinatorLayout mCLayout;
    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_state_pager);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = FragmentPagerActivity.this;

        // Get the widget reference from XML layout
        mCLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mToolbar = (Toolbar) findViewById(R.id.toolbar);
        }
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        // Set a title for toolbar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mToolbar.setTitle("FragmentPagerAdapter");
        }

        // Set the support action bar
        setSupportActionBar(mToolbar);

        // Initialize a new instance of PagerAdapter
        PagerAdapter adapter = new SimpleFragmentPagerAdapter(
                getSupportFragmentManager(),
                mActivity
        );

        // Set a PagerAdapter for ViewPager
        mViewPager.setAdapter(adapter);

        // Setup the TabLayout with ViewPager
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
