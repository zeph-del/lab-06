package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();

        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
// This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void has_and_count() {
        CityList cityList = mockCityList();
        City city1 = new City("Edmoton", "Alberta");
        City city2 = new City("Nananaimo", "BC");
        cityList.getCities().add(city2);
        cityList.getCities().add(city1);
        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(city1));
        assertFalse(cityList.hasCity(new City("falsetest", "false")));
        assertTrue(cityList.hasCity(city2));

    }

    @Test
    public void test_delete() {
        CityList cityList = mockCityList();
        City city = new City("Edmoton", "Alberta");

        cityList.getCities().add(city);
        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    public void test_throws_exception() {
        CityList cityList = mockCityList();
        City city = new City("Nothing","Nowhere");

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

}
