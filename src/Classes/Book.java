package Classes;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {
        this.title = "Неизвестно";
        this.author = "Неизвестно";
        this.year = 0;
        this.publisher = "Неизвестно";
        this.genre = "Неизвестно";
        this.pageCount = 0;
    }

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите название книги:");
        this.title = scanner.nextLine();

        System.out.println("Введите автора книги:");
        this.author = scanner.nextLine();

        System.out.println("Введите год издания книги:");
        this.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите издательство книги:");
        this.publisher = scanner.nextLine();

        System.out.println("Введите жанр книги");
        this.genre = scanner.nextLine();
        
        System.out.println("Введите количество страниц книги:");
        this.pageCount = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

    }

    public void print() {
        System.out.println("\nНазвание книги:" + title + "\nФИО автора: " + author +
                "\nГод выпуска: " + year + "\nНазвание издательства: " + publisher +
                "\nЖанр книги: " + genre + "\nКоличество страниц: " + pageCount);
    }

    @Override
    public String toString() {
        return "\nНазвание книги:" + title + "\nФИО автора: " + author +
                "\nГод выпуска: " + year + "\nНазвание издательства: " + publisher +
                "\nЖанр книги: " + genre + "\nКоличество страниц: " + pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }
}
