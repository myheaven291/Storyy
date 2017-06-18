package com.example.huy.storyy.databases;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huy on 6/17/2017.
 */

public class DatabaseHandle {
    // Create instance MyDabase
    private MyDatabase myDatabase;

    public DatabaseHandle(Context context) {
        myDatabase = new MyDatabase(context);
    }

    // create instance DatabaseHandle
    private static DatabaseHandle instance;

    public static DatabaseHandle getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseHandle(context);
        }
        return instance;
    }

    //create instance SQLiteDatabase
    private SQLiteDatabase storyDatabase;

    // get List story
    public List<StoryModel> getListStory() {
        storyDatabase = myDatabase.getReadableDatabase();

        List<StoryModel> storyModelList = new ArrayList<>();

        Cursor cursor = storyDatabase.rawQuery("select* from tbl_short_story", null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            int id = cursor.getInt(0);
            String image = cursor.getString(1);
            String tittle = cursor.getString(2);
            String description = cursor.getString(3);
            String content = cursor.getString(4);
            String author = cursor.getString(5);
            Boolean bookmark = cursor.getInt(6) != 0;

            StoryModel storyModel = new StoryModel(id, image, tittle, description, content, author, bookmark);
            storyModelList.add(storyModel);
            cursor.moveToNext();
        }
        return storyModelList;
    }
}
