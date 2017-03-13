package com.codeclan.androidstudiopracticemovies;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

    public class Ranking {

        private ArrayList<Movie> movies;


    public Ranking(){
        this.movies = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public int getLength() {
        return movies.size();
    }
}
