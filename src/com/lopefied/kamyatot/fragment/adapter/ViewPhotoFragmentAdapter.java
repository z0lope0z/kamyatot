
package com.lopefied.kamyatot.fragment.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lopefied.kamyatot.fragment.KamyaFragment;
import com.lopefied.kamyatot.model.ThatsAllEnum;

/**
 * @author Lope Chupijay Emano
 */
public class ViewPhotoFragmentAdapter extends FragmentStatePagerAdapter {

    public ViewPhotoFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new KamyaFragment();
        if (position < getCount()) {
            Bundle args = new Bundle();
            args.putString(KamyaFragment.ARG_TEXT, ThatsAllEnum.values()[position].lyrics);
            fragment.setArguments(args);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return ThatsAllEnum.values().length;
    }

}
