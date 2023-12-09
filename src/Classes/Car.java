package Classes;

import java.util.Scanner;

public class Car {
    private String carname;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
        this.carname = "Неизвестно";
        this.manufacturer = "Неизвестно";
        this.year = 0;
        this.engineVolume = 0;
    }

    public Car(String carname, String manufacturer, int year, double engineVolume) {
        this.carname = carname;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите название автомобиля:");
        this.carname = scanner.nextLine();

        System.out.println("Введите название производителя:");
        this.manufacturer = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        this.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите объём двигателя:");
        this.engineVolume = scanner.nextDouble();
        scanner.nextLine();
    }

    public void print() {
        System.out.println("\nНазвание: " + carname + "\nПроизводитель: " + manufacturer +
                "\nГод выпуска: " + year + "\nОбъем двигателя: " + engineVolume);
    }

    @Override
    public String toString() {
        return "\nНазвание: " + carname + "\nПроизводитель: " + manufacturer +
                "\nГод выпуска: " + year + "\nОбъем двигателя: " + engineVolume;
    }

    public void setCarName(String carname) {
        this.carname = carname;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getCarName() {
        return carname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
