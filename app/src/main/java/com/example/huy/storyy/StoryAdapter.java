package com.example.huy.storyy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.huy.storyy.databases.StoryModel;

import java.util.List;

/**
 * Created by Huy on 6/17/2017.
 */

public class StoryAdapter extends ArrayAdapter<StoryModel>{
    private Context context;
    private int resource;
    private List<StoryModel> storyModelList;

    public StoryAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<StoryModel> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.storyModelList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.item_list_story, null);
        StoryModel storyModel = storyModelList.get(position);

        TextView tvTittle = (TextView) convertView.findViewById(R.id.tv_tittle);
        TextView tvAuthor = (TextView) convertView.findViewById(R.id.tv_author);
        ImageView ivStory = (ImageView) convertView.findViewById(R.id.iv_story);

        tvTittle.setText(storyModel.getTittle());
        tvAuthor.setText(storyModel.getAuthor());

        String image[] = storyModel.getImage().split(",");
        byte[] decodeByte = Base64.decode(image[1],Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decodeByte,0,decodeByte.length);
        ivStory.setImageBitmap(bitmap);

        return convertView;
    }
}
