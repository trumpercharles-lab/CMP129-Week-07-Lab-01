public class LibraryTest {
    public static void main(String args[]){
        Library PublicLibrary=new Library();

        PublicLibrary.addBook("James and the Giant Peach", "Some Guy", "ADHS478", 12);
        PublicLibrary.addBook("Harry Potter", "Cool Guy", "KFIUE89", 7);
        PublicLibrary.registerMember("James", 22);

        PublicLibrary.displayLibrary();
    }
}
