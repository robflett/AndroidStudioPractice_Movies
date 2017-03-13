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
    Movie movie2;
    Movie movie3;

    @Before
    public void before() {
        movies = new Ranking();
        movie = new Movie("Face/Off", "Action", 1);
        movie2 = new Movie("Jaws", "Thriller", 2);
        movie3 = new Movie("When Harry Met Sally", "RomCom", 2);
        movies.addMovie(movie);
        movies.addMovie(movie2);
    }

    @Test
    public void testAddMovie(){

        assertEquals(2, movies.getLength() );
    }

    @Test
    public void testGetIndexByTitle(){
        assertEquals(1, movies.getMovieIndex("Jaws") );
    }

//    @Test
//    public void testGetMovieByIndex(){
//        assertEquals("Jaws", movies.getMovieByIndex(1));
//    }

    @Test
    public void testReplaceLastEntryInArrayList(){
        movies.replaceLastEntryInArrayList(movie3);
        assertEquals(2, movies.getLength() );
    }

}
