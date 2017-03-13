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



    public int getMovieIndex(String item) {
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (item.equals(movie.getTitle())) {
                return i;
            }
        }

        return -1;
    }

//    public Movie getMovieByIndex(int index){
//
//        return movies.get(index);
//        }
//    }

    public void replaceLastEntryInArrayList(Movie movie) {
        movies.remove(movies.size() - 1);
        movies.add(movie);
    }
}
