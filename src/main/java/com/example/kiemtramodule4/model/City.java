package com.example.kiemtramodule4.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Pattern(regexp = "^[a-zA-Z]{15}")
    private String nameCity;
    @Size(min =(5),max = (20))
    private int area;
    private long population;
    private long gdp;
    private String describeTheCity;

    @ManyToOne
    private Country country;



    public City() {
    }

    public City(long id, String nameCity, int area, long population, long gdp, String describeTheCity, Country country) {
        this.id = id;
        this.nameCity = nameCity;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.describeTheCity = describeTheCity;
        this.country = country;
    }

    public City(String nameCity, int area, long population, long gdp, String describeTheCity, Country country) {
        this.nameCity = nameCity;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.describeTheCity = describeTheCity;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    public String getDescribeTheCity() {
        return describeTheCity;
    }

    public void setDescribeTheCity(String describeTheCity) {
        this.describeTheCity = describeTheCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
