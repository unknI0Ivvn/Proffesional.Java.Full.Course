package Lesson2.HomeworkCheat.book;

public class BookTester {
    public static void main(String[] args) {
        Author leo = new Author("Leo", "Tolstoy");
        
        Book b = new Book("War and Peace ", leo, 34.5);

        System.out.println(b);

    }
}
