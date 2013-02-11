
package com.lopefied.kamyatot.model;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.lopefied.kamyatot.R;

/**
 * @author Lope Chupijay Emano
 */
public enum ThatsAllEnum {
    ONLY_GIVE(1, "I can only give you love that lasts forever"), PROMISE(2,
            "and a promise to be near each time you call"), ONLY_HEART(3,
            "and the only heart i own, for you and you alone"), THATS_ALL(4,
            "that's all, that's all"), ONLY_GIVE_COUNTRY(5,
            "I can only give you country walks in spring time"), HAND_TO_HOLD(6,
            "and a hand to hold when leaves begin to fall"), LOVE_LIGHT(7,
            "and a love whos burning light can warm the winter nights"), THATS_ALL2(8,
            "that's all, that's all"), INSTRUMENTAL(9, "(instrumental, lol)"), THERE_THOSE(10,
            "there are those I am sure who have told you"), WHO_WOULD(11,
            "who would give you the world for a toy"), ALL_I_HAVE(12,
            "all i have are these arms to enfold you.."), LOVE_TIME(13,
            "and a love time can never destroy"), LOOK_AT_ME(14,
            "(look at the cool handsome guy in front of you :P)");

    private static Map<Integer, ThatsAllEnum> lyricsMapping;
    private static final int DEFAULT_BACKGROUND = R.drawable.ic_action_search;
    private int lineNumber;
    public String lyrics;
    public int resourceID;

    private ThatsAllEnum(int lineNumber, String lyrics) {
        this.lineNumber = lineNumber;
        this.lyrics = lyrics;
        this.resourceID = DEFAULT_BACKGROUND;
    }

    private ThatsAllEnum(int lineNumber, String lyrics, int resourceID) {
        this.lineNumber = lineNumber;
        this.lyrics = lyrics;
        this.resourceID = resourceID;
    }

    public String getLyrics(int lineNumber) {
        if (lyricsMapping == null) {
            initMapping();
        }
        return lyricsMapping.get(lineNumber).lyrics;
    }

    public Bitmap getBitmap(int lineNumber, Context mContext) {
        if (lyricsMapping == null) {
            initMapping();
        }
        return BitmapFactory.decodeResource(mContext.getResources(),
                lyricsMapping.get(lineNumber).resourceID);
    }

    private static void initMapping() {
        lyricsMapping = new HashMap<Integer, ThatsAllEnum>();
        for (ThatsAllEnum s : values()) {
            lyricsMapping.put(s.lineNumber, s);
        }
    }

}
