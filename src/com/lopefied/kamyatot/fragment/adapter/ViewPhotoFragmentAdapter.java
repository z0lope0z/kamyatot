package com.lopefied.kamyatot.fragment.adapter;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lopefied.kamyatot.fragment.PhotoFragment;
import com.lopefied.kamyatot.model.Photo;

public class ViewPhotoFragmentAdapter extends FragmentStatePagerAdapter {
    private List<Photo> photos;

    public ViewPhotoFragmentAdapter(FragmentManager fm, List<Photo> photos) {
        super(fm);
        this.photos = photos;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new PhotoFragment();
        if (i < getCount()) {
            Bundle args = new Bundle();
//            args.putString(PhotoFragment.ARG_IMAGE_URL, photos.get(i)
//                    .getPhotoURL());
            fragment.setArguments(args);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return photos.size();
    }

}