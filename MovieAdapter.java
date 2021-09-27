package com.example.flixster.adapters;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flixster.R;
import com.example.flixster.adapters.MovieAdapter;

import java.util.List;

import movie.GetTitle;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    Context context;
    List<Movie> movies;
     public MovieAdapter(Context context, List<Movie> movies){
         this.context=context;
         this.movies=movies;
     }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View movieView=LayoutInflater.from(context).inflate(R.layout.item_movie,parent, false);
         return new ViewHolder(movieView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie =movies.get(position);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView2;
        TextView textView3;
        ImageView ivposter;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);
            ivposter=itemView.findViewById(R.id.ivposter);
        }

    }
}
