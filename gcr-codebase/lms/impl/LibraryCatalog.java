package lms.impl;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private static LibraryCatalog instance;

    private final List<Book> books = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
    }

    private void notifyObservers(String bookName) {
        System.out.println("==== Notifying Observers ====");
        for (Observer observer : observers) {
            observer.update("New book available: " + bookName);
        }
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookByIndex(int idx){
        return books.get(idx);
    }

    public List<Observer> getAllObservers(){
        return observers;
    }

    public Observer getObserverByIndex(int idx){
        return observers.get(idx);
    }
}
