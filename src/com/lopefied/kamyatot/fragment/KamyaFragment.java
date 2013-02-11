
package com.lopefied.kamyatot.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lopefied.kamyatot.R;

public class KamyaFragment extends Fragment {
    public static final String ARG_TEXT = "text";
    public static final String ARG_IMAGE_URL = "image_url";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(R.layout.fragment_text, container, false);
        Bundle args = getArguments();
        String textString = args.getString(ARG_TEXT);
        TextView textView = (TextView) rootView.findViewById(R.id.textView);
        textView.setText(textString);
        return rootView;
    }

}
