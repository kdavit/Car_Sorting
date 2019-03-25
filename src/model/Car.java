package model;

public class Car {
    private String car;
    private int year;
    private long sales;
    private String country;

    public Car(String car, int year, long sales, String country) {
        this.car = car;
        this.year = year;
        this.sales = sales;
        this.country = country;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
