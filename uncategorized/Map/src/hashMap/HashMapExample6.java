package hashMap;

import java.util.HashMap;
import java.util.Map;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}

public class HashMapExample6 {

    public static void main(String[] args) {

        //creat map of Books
        Map<Integer, Book> map = new HashMap<Integer, Book>();

        //creating Books
        Book b1 = new Book(101, "Manual chimie", "Popescu Ioana", "Polirom", 10);
        Book b2 = new Book(102, "Manual fizica", "Popescu Ioana", "Polirom", 20);
        Book b3 = new Book(103, "Manual biologie", "Marcu Ionel", "Polirom", 20);
        Book b4 = new Book(104, "Manual matematica", "Sabin Gheorghe", "Polirom", 20);

        //put books in map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //traversing map
        for (Map.Entry<Integer, Book> m : map.entrySet()) {
            int key = m.getKey();
            Book b = m.getValue();
            System.out.println(key + " Details");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

        }


    }

}
