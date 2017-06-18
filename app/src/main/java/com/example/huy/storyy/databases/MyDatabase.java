package com.example.huy.storyy.databases;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Huy on 6/17/2017.
 */

public class MyDatabase extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "short_story.db";
    private static final int DATABASE_VERSION = 1;

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
