package com.java8.features.repo;

public class Address {

    private String block;
    private String city;
    private String state;

    

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String block, String city, String state) {
        this.block = block;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [block=" + block + ", city=" + city + ", state=" + state + "]";
    }

    

}
