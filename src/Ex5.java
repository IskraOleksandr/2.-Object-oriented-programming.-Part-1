import Classes.Book;

public class Ex5 {
    public static void main(String[] args) {

        //Конструктор без параметров
        Book book = new Book();
        //set
        book.setTitle("Гарри Поттер и философский камень");
        book.setAuthor("Джоан Роулинг");
        book.setYear(1997);
        book.setPublisher("Bloomsbury Publishing");
        book.setGenre("Фэнтези");
        book.setPageCount(332);

        System.out.println("\nДанные получаные с помощью методов get: \nНазвание книги:" + book.getTitle() +
                "\nФИО автора: " + book.getAuthor() + "\nГод выпуска: " + book.getYear() +
                "\nНазвание издательства: " + book.getPublisher() + "\nЖанр книги: " +
                book.getGenre() + "\nКоличество страниц: " + book.getPageCount());


        //Конструктор с параметрами
        Book book1 = new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг ", 1998,
                "Bloomsbury Publishing", "Фэнтези", 345);
        
        System.out.println("\nДанные получанные перегруженым методом toString() " + book1);


        Book book2 = new Book();
        System.out.println("\nМетод ввода данных input()");
        book2.input();
        System.out.println("\nМетод вывода данных print()");
        book2.print();


    }
}