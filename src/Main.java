import Classes.City;
import Classes.Country;
import Classes.Person;
import Classes.Fraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nКласс Person");
        //Конструктор без параметров
        Person person = new Person();
        //set
        person.setFullname("Виталий Сергеевич ");
        person.setDateOfBirth("2010/27/02");
        person.setPhoneNumber("+380977564321");
        person.setCity("Киев");
        person.setCountry("Украина");
        person.setHomeAddress("адрес");

        System.out.println("\nДанные получаные с помощью методов get: \nФИО: " + person.getFullname()
                + "\nДата рождения: " + person.getDateOfBirth() + "\nHомер телефона: " + person.getPhoneNumber()
                + "\nГород: " + person.getCity() + "\nСтрана: " + person.getCountry()
                + "\nдомашний адрес: " + person.getHomeAddress());

        //Конструктор с параметрами
        Person person1 = new Person("Сергей", "2000/20/05", "+45727867947", "Львов", "Украина", "Нет");
        System.out.println("\nДанные получанные перегруженым методом toString() " + person1);

        Person person2 = new Person();
        System.out.println("\nМетод ввода данных input()");
        person2.input();
        System.out.println("\nМетод вывода данных print()");
        person2.print();


        System.out.println("\nКласс City");
        //Конструктор без параметров
        City city = new City();
        //set
        city.setCityname("Киев ");
        city.setRegion("Центр");
        city.setCountry("Украина");
        city.setPopulation(100000);
        city.setPostalCode(1347);
        city.setPhoneCode("23457");

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание города: " + city.getCityname()
                + "\nНазвание региона: " + city.getRegion() + "\nНазвание страны: " + city.getCountry()
                + "\nКоличество жителей: " + city.getPopulation() + "\nПочтовый индекс города: " + city.getPostalCode()
                + "\nТелефонный код города: " + city.getPhoneCode());

        //Конструктор с параметрами
        City city1 = new City("Львов", "Запад", "Украина", 550000, 12345, "3566");
        System.out.println("\nДанные получанные перегруженым методом toString() " + city1);

        City city2 = new City();
        System.out.println("\nМетод ввода данных input()");
        city2.input();
        System.out.println("\nМетод вывода данных print()");
        city2.print();


        System.out.println("\n\nКласс Country");
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

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание города: " + city.getCityname()
                + "\nНазвание региона: " + city.getRegion() + "\nНазвание страны: " + city.getCountry()
                + "\nКоличество жителей: " + city.getPopulation() + "\nПочтовый индекс города: " + city.getPostalCode()
                + "\nТелефонный код города: " + city.getPhoneCode());

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

