package Classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Country {
    private String countryname;
    private String continent;
    private int population;
    private int countrycode;
    private String capital;
    private ArrayList<String> cities;

    public Country() {
        this.countryname = "Неизвестно";
        this.continent = "Неизвестно";
        this.population = 0;
        this.countrycode = 0;
        this.capital = "+380 (5134)";
        this.cities = new ArrayList<>();
    }

    public Country(String countryname, String continent, int population, int countryCode, String capital, ArrayList<String> cities) {
        this.countryname = countryname;
        this.continent = continent;
        this.population = population;
        this.countrycode = countryCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите название страны:");
        this.countryname = scanner.nextLine();

        System.out.println("Введите название континента:");
        this.continent = scanner.nextLine();

        System.out.println("Введите количество жителей в стране:");
        this.population = scanner.nextInt();

        System.out.println("Введите телефонный код страны:");
        this.countrycode = scanner.nextInt();

        scanner.nextLine(); // Очистка буфера

        System.out.println("Введите название столицы:");
        this.capital = scanner.nextLine();

        System.out.println("Введите название городов страны (через запятую):");
        String citiesString = scanner.nextLine();

        String[] citySplit = citiesString.split(",");
        for (String city : citySplit) {
            cities.add(city.trim());
        }
    }

    public void print() {
        System.out.println("Страна: " + this.countryname + "\nКонтинент: " + this.continent
                + "\nКоличество жителей: " + this.population + "\nТелефонный код: "
                + this.countrycode + "\nСтолица: " + this.capital + "\nГорода: ");
        for (String city : this.cities) {
            System.out.println(city);
        }
    }

    @Override
    public String toString() {
        return "\nСтрана: " + this.countryname + "\nКонтинент: " + this.continent +
                "\nКоличество жителей: " + this.population + "\nТелефонный код страни: " + this.countrycode +
                "\nТелефонный код города: " + cities.toString();
    }

    //set
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCountrycode(int countryCode) {
        this.countrycode = countryCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public void addCity(String city) {
        cities.add(city);
    }

    //get
    public String getCountryname() {
        return countryname;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public String getCapital() {
        return capital;
    }

    public ArrayList<String> getCities() {
        return cities;
    }
}