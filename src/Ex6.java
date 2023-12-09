import Classes.Car;

public class Ex6 {
    public static void main(String[] args) {
        
        //Конструктор без параметров
        Car car = new Car();
        //set
        car.setCarName("Nisan");
        car.setManufacturer("Центр");
        car.setYear(2010);
        car.setEngineVolume(100);

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание: " + car.getCarName() + "\nПроизводитель: " + car.getManufacturer() +
                "\nГод выпуска: " + car.getYear() + "\nОбъем двигателя: " + car.getEngineVolume());

        //Конструктор с параметрами
        Car car1 = new Car("Subaru", "Центр", 2013, 300);
        System.out.println("\nДанные получанные перегруженым методом toString() " + car1);

        Car car2 = new Car();
        System.out.println("\nМетод ввода данных input()");
        car2.input();
        System.out.println("\nМетод вывода данных print()");
        car.print();

    }
}

