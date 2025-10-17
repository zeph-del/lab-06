package com.example.listycity;

/**
 * This class holds the city data and information
 */
public class City implements Comparable<City> {
    private String city;
    private String name;
    private String province;
    City(String c, String province){
        this.city = city;
        this.province = province;
    }
    public String getCity(){
        return city;
    }
    public String getName(){
        return name;
    }
    public String getProvince(){
        return province;
    }
    public void setProvince(String province){
        this.province = province;

    }

    /**
     * This method compares City objects based on their cityname field
     * @param o the object to be compared.
     * @return 0, <1 or >1 if two values are equal, a<b, or a>b
     */
    @Override
    public int compareTo(City o) {
        //City city = (City) o;
       return this.city.compareTo(o.getCity());
    }

}
