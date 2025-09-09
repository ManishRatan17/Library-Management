package Library;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        String name;
        String bookName;
        int choice;

        Scanner sc = new Scanner(System.in);
        Members member = new Members();
        Books books = new Books(member);
        Library library = new Library( books);

        library.display();

        while (true) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Please enter member name: ");
                    name = sc.nextLine();
                    member.registerMember(name);
                    break;
                }
                case 2: {
                    System.out.println("Please enter book name and Member ID: ");
                    bookName = sc.nextLine();
                    name = sc.nextLine();
                    books.issueBook(bookName, name);
                    break;
                }
                case 3: {
                    System.out.println("Please enter book name and Member ID: ");
                    bookName = sc.nextLine();
                    name = sc.nextLine();
                    books.returnBook(bookName, name);
                    break;
                }
                case 4:
                    books.printBooks();
                    break;
                case 5:
                    member.printMembers();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


}


