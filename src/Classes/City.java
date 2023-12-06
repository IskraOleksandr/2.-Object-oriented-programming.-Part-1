package Classes;

import java.util.Scanner;

public class City {
    private String cityname;
    private String region;
    private String country;
    private int population;
    private int postalCode;
    private String phoneCode;

    public City() {
        this.cityname = "Неизвестно";
        this.region = "Неизвестно";
        this.country = "Неизвестно";
        this.population = 0;
        this.postalCode = 0;
        this.phoneCode = "+380 (5134)";
    }

    public City(String cityname, String region, String country, int population, int postalCode, String phoneCode) {
        this.cityname = cityname;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }


    @Override
    public String toString() {
        return "\nНазвание города: " + this.cityname + "\nНазвание региона: " + this.region +
                "\nНазвание страны: " + this.country + "\nКоличество жителей: " + this.population +
                "\nПочтовый индекс города: " + this.postalCode + "\nТелефонный код города: " + this.phoneCode;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите название города:");
        this.cityname = scanner.nextLine();

        System.out.println("Введите название региона:");
        this.region = scanner.nextLine();

        System.out.println("Введите название страны:");
        this.country = scanner.nextLine();

        System.out.println("Введите количество жителей");
        this.population = scanner.nextInt();

        scanner.nextLine(); // Очистка буфера

        System.out.println("Введите почтовый индекс города:");
        this.postalCode = scanner.nextInt();

        scanner.nextLine(); // Очистка буфера

        System.out.println("Введите телефонный код города:");
        this.phoneCode = scanner.nextLine();
    }

    public void print() {
        System.out.println("\nНазвание города: " + this.cityname + "\nНазвание региона: " + this.region +
                "\nНазвание страны: " + this.country + "\nКоличество жителей: " + this.population +
                "\nПочтовый индекс города: " + this.postalCode + "\nТелефонный код города: " + this.phoneCode);
    }

    //set
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    //get
    public String getCityname() {
        return cityname;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }
}