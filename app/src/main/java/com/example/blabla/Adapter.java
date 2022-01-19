package com.example.blabla;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends BaseAdapter {

    Activity activity;
    TextView movieTitle;
    TextView movieRating;
    ImageView movieImage;
    Context context;
    List<MovieModelClass> data;
    LayoutInflater inflater;

    public Adapter(Context c, List<MovieModelClass> data){
        this.context = c;
        this.data = data;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
            view = inflater.inflate(R.layout.activity_movie, null);

        movieTitle = (TextView) view.findViewById(R.id.movieTitle);
        movieRating = (TextView) view.findViewById(R.id.movieRating);
        movieImage =  (ImageView) view.findViewById(R.id.movieImage);

        MovieModelClass model = data.get(i);
        movieTitle.setText(model.getTitle());
        movieRating.setText(model.getRating());

        String url = model.getImage();
        Glide.with(context).load("https://www.themoviedb.org/t/p/w300_and_h450_bestv2" + url).into(movieImage);

        System.out.println(model.getImage());

        return view;

    }
}
