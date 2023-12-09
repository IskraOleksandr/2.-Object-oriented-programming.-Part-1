import Classes.City;

public class Ex2 {
    public static void main(String[] args) {

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


    }
}