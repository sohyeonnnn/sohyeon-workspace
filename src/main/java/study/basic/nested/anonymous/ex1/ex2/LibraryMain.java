package study.basic.nested.anonymous.ex1.ex2;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("java","김영한");
        library.addBook("http","김영한");
        library.addBook("spring","김영한");
        library.addBook("jpa","김영한");
        library.printBooks();
    }
}
