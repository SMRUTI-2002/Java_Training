package infinite;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Operating System");
        books.add("VLSI");
        books.add("Control System");

        System.out.println("List of books:");
        for (String bookName : books) {
            System.out.println(bookName);
        }
    }
}