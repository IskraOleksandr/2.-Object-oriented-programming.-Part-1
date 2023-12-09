import Classes.Book;

public class Ex5 {
    public static void main(String[] args) {
        
        //Конструктор без параметров
        Book book = new Book();
        //set
        book.setTitle(" Книга");
        book.setAuthor("Виталий Сергеевич");
        book.setYear(2010);
        book.setPublisher("Киев");
        book.setGenre("Украина");
        book.setPageCount(70);

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание книги:" + book.getTitle() + "\nФИО автора: " + book.getAuthor()
                + "\nГод выпуска: " + book.getYear() + "\nНазвание издательства: " + book.getPublisher() +
                "\nЖанр книги: " + book.getGenre() + "\nКоличество страниц: " + book.getPageCount());


        //Конструктор с параметрами
        Book book1 = new Book("", "Сергей ", 2016, "Львов", "Украина", 100);
        System.out.println("\nДанные получанные перегруженым методом toString() " + book1);


        Book book2 = new Book();
        System.out.println("\nМетод ввода данных input()");
        book2.input();
        System.out.println("\nМетод вывода данных print()");
        book2.print();


    }
}