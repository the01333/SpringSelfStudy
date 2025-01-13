package com.puxinxiaolin.pojo;

public class Address {

    private String city;
    private String area;

    public Address() {
    }

    public Address(String city, String area) {
        this.city = city;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
