package com.lopefied.kamyatot.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lopefied.kamyatot.R;

public class PhotoFragment extends Fragment {
    public static final String ARG_IMAGE_URL = "image_url";

    // public ImageLoader imageLoader;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(R.layout.view_photo, container, false);
        // Bundle args = getArguments();
        // String imageURL = args.getString(ARG_IMAGE_URL);
        // imageView.setImageBitmap(imageLoader.getBitmap(imageURL));
        // imageView.setMaxZoom(4f);
        return rootView;
    }
}
