package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * this adds a city object to the list
     *for the first phase it will be
     empty * @param city
     */
    public void addCity(City city){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(),listSize+1);
    }

    /**
     * This test creates a new City object and sees if it is in the list
     */
    public void hasCity(){
        City city = new City("Quebec","PQ");
        list.addCity(city);
        assertTrue("List contains Quebec", list.hasCity(city));
    }

    /**
     * This test adds city to array then deletes and checks if city object is present
     */
    public void deleteCity(){
        City city = new City("Edmonton","AB");
        list.addCity(city);
        City city2 = new City("Vancouver","BC");
        list.addCity(city2);
        list.deleteCity(city2);
        assertTrue("List contains Vancouver BC",list.hasCity(city2));

    }


}
