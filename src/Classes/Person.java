package Classes;

import java.util.Scanner;

public class Person {
    private String fullname;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
        this.fullname = "Неизвестно";
        this.dateOfBirth = "Неизвестно";
        this.phoneNumber = "Неизвестно";
        this.city = "Неизвестно";
        this.country = "Неизвестно";
        this.homeAddress = "Неизвестно";
    }

    public Person(String fullname, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }


    @Override
    public String toString() {
        return "\nФИО: " + this.fullname + "\nДата рождения: " + this.dateOfBirth +
                "\nНомер телефона: " + this.phoneNumber + "\nГород: " + this.city +
                "\nСтрана: " + this.country + "\nДомашний адрес: " + this.homeAddress;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите ФИО:");
        this.fullname = scanner.nextLine();

        System.out.println("Введите дату рождения:");
        this.dateOfBirth = scanner.nextLine();

        System.out.println("Введите номер телефона:");
        this.phoneNumber = scanner.nextLine();

        System.out.println("Введите название города");
        this.city = scanner.nextLine();

        System.out.println("Введите название страны:");
        this.country = scanner.nextLine();

        System.out.println("Введите домашний адрес:");
        this.homeAddress = scanner.nextLine();
    }

    public void print() {
        System.out.println("\nФИО: " + this.fullname + "\nДата рождения: " + this.dateOfBirth +
                "\nНомер телефона: " + this.phoneNumber + "\nГород: " + this.city +
                "\nСтрана: " + this.country + "\nДомашний адрес: " + this.homeAddress);
    }

    //set
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    //get
    public String getFullname() {
        return fullname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
}