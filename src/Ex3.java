import Classes.Country;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        //Конструктор без параметров
        Country country = new Country();
        //set
        country.setCountryname("Украина");
        country.setContinent("Центр");
        country.setPopulation(10000000);
        country.setCountrycode(100000);
        country.setCapital("1347");
        country.addCity("Киев");
        country.addCity("Львов");

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание страны: " + country.getCountryname()
                + "\nНазвание континента: " + country.getContinent() + "\nКоличество жителей : " + country.getPopulation()
                + "\nТелефонный код страни: " + country.getPopulation() + "\nСтолица: " + country.getCapital() +
                "\nГорода: " + country.getCities().toString());

        //Конструктор с параметрами
        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Одесса");
        cities.add("Винница");
        Country country1 = new Country("Украина", "Запад", 1000000, 550000, "Киев", cities);
        System.out.println("\nДанные получанные перегруженым методом toString() " + country1);

        Country country2 = new Country();
        System.out.println("\nМетод ввода данных input()");
        country2.input();
        System.out.println("\nМетод вывода данных print()");
        country2.print();

    }
}