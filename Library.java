package Library;




public class Library {

    private Books books;

    Library(Books book) {
        this.books = book;
    }

    public void display(){
        System.out.println("\n===============Welcome to the Library===============\n");
        System.out.println("----------------------------------------------------");
        books.printBooks();
        System.out.println("-------------------------------------------------");
        printChoice();
    }


    public void printChoice() {
        System.out.println("1. Register Member");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. View All Books");
        System.out.println("5. View All Members");
        System.out.println("6. Exit");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
    }



}