
package com.lopefied.kamyatot.chupipoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.lopefied.kamyatot.R;

/**
 * @author Lope Chupijay Emano
 */
public class ChupipoyHelper {
    private static final int DEFAULT_BACKGROUND = R.drawable.ic_action_search;

    public static final Bitmap convertLine(Context mContext, int line) {
        int resourceID = DEFAULT_BACKGROUND;
        switch (line) {
            case 2:

                break;

            default:
                resourceID = DEFAULT_BACKGROUND;
                break;
        }
        return BitmapFactory.decodeResource(mContext.getResources(), resourceID);
    }
}
