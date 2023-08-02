package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor
        Movie movie1 = new Movie(111,"Evil Dead1","Action","12/02/2008");
        Movie movie2 = new Movie(112,"Evil Dead2","Horror","12/02/2009");
        Movie movie3 = new Movie(113,"Evil Dead3","Comedy","12/02/2010");
        Movie movie4 = new Movie(114,"Evil Dead4","Western","12/02/2011");
        Movie movie5 = new Movie(115,"Evil Dead5","Comedy","12/02/2012");

        //create HashMap object and add all the Movie object inside it
        HashMap<Movie,Integer> map = new HashMap<>();

        //Key will be movie object and value will be rating ranging from 1 to 5
        map.put(movie1,2);
        map.put(movie2,5);
        map.put(movie3,1);
        map.put(movie4,5);
        map.put(movie5,4);

        //return the HashMap object
        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
        TreeSet<String> set = new TreeSet<>();
        //Use entrySet() method to iterate through the map object
        for (Map.Entry<Movie,Integer> m : map.entrySet()) {
            Movie movie = m.getKey();
            Integer key = m.getValue();
            //retrieve all the movies name having rating as 4
            if (m.getValue()==4)
            {
                //Store the movie name in TreeSet object
                set.add(m.getKey().getMovieName());
            }
        }

        //return the TreeSet object
      return set;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        List<String> list = new ArrayList<>();
        //get the first value from the map and store it in the variable max
        // Use entrySet().iterator().next() method to retrieve the first value of Map object
            int max = map.entrySet().iterator().next().getValue();
            //get the name of the movie with the highest rating and add it in the List created
            for (Map.Entry<Movie,Integer> m : map.entrySet())
            {
                if (max<m.getValue())
                {
                    max=m.getValue();
                }
            }
            for (Map.Entry<Movie,Integer> m : map.entrySet())
            {
                if (m.getValue()==max)
                {
                    list.add(m.getKey().getMovieName());
                }
            }

    //return the List object
        return list;
    }

    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String> map1 = new HashMap<>();
        //use entrySet to iterate through the Map object
        for (Map.Entry<Movie,Integer> m : map.entrySet())
        {
            //get all the movies name and their released date for the movie of genre "comedy"
            if (m.getKey().getGenre().equalsIgnoreCase("comedy"))
            {
                //store movie name with release date in the above created Map object and return the Map object
                map1.put(m.getKey().getMovieName(),m.getKey().getReleaseDate());
            }
        }
        return map1;
    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
