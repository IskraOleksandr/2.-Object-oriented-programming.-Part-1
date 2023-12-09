import Classes.Person;

public class Ex1 {
    public static void main(String[] args) {

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


    }
}