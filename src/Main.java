import Classes.City;
import Classes.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Класс Person");
        //Конструктор без параметров
        Person person = new Person();
        //set
        person.setFullname("Виталий Сергеевич ");
        person.setDateOfBirth("2010/27/02");
        person.setPhoneNumber("+380977564321");
        person.setCity("Киев");
        person.setCountry("Украина");
        person.setHomeAddress("адрес");

        System.out.println("\n Данные получаные с помощью методов get: \nФИО: " + person.getFullname()
                + "\nДата рождения: " + person.getDateOfBirth() + "\nHомер телефона: " + person.getPhoneNumber()
                + "\nГород: " + person.getCity() + "\nСтрана: " + person.getCountry()
                + "\nдомашний адрес: " + person.getHomeAddress());

        //Конструктор с параметрами
        Person person1 = new Person("Сергей", "2000/20/05", "+45727867947", "Львов", "Украина", "Нет");
        System.out.println("\nДанные получанные перегруженым методом toString() " + person1);


        System.out.println("Класс City");
        //Конструктор без параметров
        City city = new City();
        //set
        city.setCityname("Киев ");
        city.setRegion("Центр");
        city.setCountry("Украина");
        city.setPopulation(100000);
        city.setPostalCode(1347);
        city.setPhoneCode("23457");

        System.out.println("\n Данные получаные с помощью методов get: \nНазвание города: " + city.getCityname()
                + "\nНазвание региона: " + city.getRegion() + "\nНазвание страны: " + city.getCountry()
                + "\nКоличество жителей: " + city.getPopulation() + "\nПочтовый индекс города: " + city.getPostalCode()
                + "\nТелефонный код города: " + city.getPhoneCode());

        //Конструктор с параметрами
        City city1 = new City("Львов", "Запад", "Украина", 550000, 12345, "3566");
        System.out.println("\nДанные получанные перегруженым методом toString() " + city1);
    }
}

