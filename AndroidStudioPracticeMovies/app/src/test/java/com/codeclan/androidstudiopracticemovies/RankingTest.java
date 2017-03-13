package com.codeclan.androidstudiopracticemovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by user on 13/03/2017.
 */

public class RankingTest {

    Ranking movies;
    Movie movie;

    @Before
    public void before() {
        movies = new Ranking();
        movie = new Movie("Face/Off", "Action", 1);
        movies.addMovie(movie);
    }

    @Test
    public void testAddMovie(){

        assertEquals(1, movies.getLength() );
    }

}
