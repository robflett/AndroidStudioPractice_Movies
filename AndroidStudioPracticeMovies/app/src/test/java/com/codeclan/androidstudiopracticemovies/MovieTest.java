package com.codeclan.androidstudiopracticemovies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Face/Off", "Action", 1);
    }

    @Test
    public void testMovieSetUp() {
        assertEquals("Face/Off", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(1, movie.getRanking());
    }
}