
package com.lopefied.kamyatot;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.lopefied.kamyatot.fragment.adapter.ViewPhotoFragmentAdapter;

/**
 * @author Lope Chupijay Emano
 */
public class MainActivity extends FragmentActivity {
    private ViewPhotoFragmentAdapter mFragmentAdapter;
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mFragmentAdapter = new ViewPhotoFragmentAdapter(
                getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mFragmentAdapter);
    }
}
