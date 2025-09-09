package Library;


import java.util.*;

public class Books {
    private Members member;


    private Map<String, String> borrowedBooks = new LinkedHashMap<>();
    private Map<String, String> allBooks = new LinkedHashMap<>();
    private Map<String, String> removedBooks = new LinkedHashMap<>();

    int i;

    Books(Members member) {
        allBooks.put("The Alchemist", "Paulo Coelho");
        allBooks.put("1984", "George Orwell");
        allBooks.put("Wings of Fire", "APJ Abdul Kalam");
        allBooks.put("The Great Gatsby", "F. Scott Fitzgerald");
        allBooks.put("Pride and Prejudice", "Jane Austen");
        this.member = member;
    }

    public void printBooks() {
            i = 0;
        for (Map.Entry<String, String> entry : allBooks.entrySet()) {
            i++;
            System.out.printf("%d. %s  -  %s%n", i, entry.getKey(), entry.getValue());
        }
    }


    public void issueBook(String bookName, String id) {
        boolean found= false;
        for (Map.Entry<String, String> entry : allBooks.entrySet()) {
            if ((member.members.containsKey(id)) && (entry.getKey().equalsIgnoreCase(bookName))) {
               String removed= allBooks.remove(entry.getKey());
                removedBooks.put(entry.getKey(), removed);
                borrowedBooks.put(id, entry.getKey());
                System.out.println("Book Issued to :" + id);
                found =true;
                break;
            }
        } if(!found)
                System.out.println("Book not found\nor Member not found");
    }


    public void returnBook(String bookName, String id) {
        String boook= borrowedBooks.get(id);
        if (borrowedBooks.containsKey(id)&& boook.equalsIgnoreCase(bookName)) {
                allBooks.put(boook, removedBooks.get(boook));
                borrowedBooks.remove(id, bookName);
                System.out.println("Book Returned by :" + id);
        }else
            System.out.println("Book not found\nor Member has not borrowed a books ");
    }

}
