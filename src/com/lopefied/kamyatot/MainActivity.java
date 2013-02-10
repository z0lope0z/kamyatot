
package com.lopefied.kamyatot;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.lopefied.kamyatot.fragment.adapter.ViewPhotoFragmentAdapter;
import com.lopefied.kamyatot.model.Photo;

/**
 * @author Lope Chupijay Emano
 */
public class MainActivity extends FragmentActivity {
    private ViewPhotoFragmentAdapter mFragmentAdapter;
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        List<Photo> photos = new ArrayList<Photo>();
        mFragmentAdapter = new ViewPhotoFragmentAdapter(
                getSupportFragmentManager(), photos);
        mViewPager = (ViewPager) findViewById(R.id.pager);
    }

}
