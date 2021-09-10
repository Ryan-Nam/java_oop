package Section_5_API;

import java.util.ArrayList;

public class Q4_ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();

        Book onePiece = new Book("One Piece", 4500);
        Book naruto = new Book("Naruto", 4000);
        Book java = new Book("Java Programming", 24000);

        list.add(onePiece);
        list.add(naruto);
        list.add(java);

        for (int i = 0; i < list.size(); i++) {
            //Book book = list.get(i);
            System.out.printf("list.get(%d) -> %s\n", i, list.get(i).toString());
        }
    }
}

class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String toString(){
        return String.format("Book { name: %s, price: %d }", title, price);
    }
}