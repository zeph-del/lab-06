package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This Class holds the city type objects in a list
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * this method adds a city object to the cities list
     * @param city
     *  This is a city object that we want to add to the list
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city){
        if(cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This method sorts the list of cities
     * @return
     *     a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * Checks whether a specific city exists in the current list.
     *
     * @param city the city to look for
     * @return true if the city is found in the list, false otherwise
     */
    public boolean hasCity(City city){
    if(this.getCities().contains(city.getName())){
        return true;
    }else{return false;}
    }
    /**
     * Removes the given city from the list if it exists.
     * If the city is not found, an IllegalArgumentException is thrown.
     *
     * @param city the city to remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city){
        if(this.getCities().contains(city.getName())){
            this.getCities().remove(city);
        } else{
            throw new IllegalArgumentException();
        }
    }
    /**
     * Returns the total number of cities currently stored in the list.
     *
     * @return the number of cities in the list
     */
    public int countCities(){
    return this.getCities().size();
    }
}
