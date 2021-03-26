import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Library{
    private String[] avaliableBooks, issuedBooks;
    private int avaliable, issued;

    Library(){
        avaliableBooks = new String[500];
        issuedBooks = new String[500];
        String originalBooks[] = {"Java For Dummies", "Clean Code", "CSLR", "Java The Complete Reference", "As a Man Thinketh", "Marketing Management by Philip Kotla"};
        avaliable = originalBooks.length;
        issued = 0;
        for(int i=0;i<avaliable;i++)
            avaliableBooks[i] = originalBooks[i];
    }

    // Getters for 'avaliable' and 'issued'
    int getAvailable(){
        return avaliable;
    }

    int getIssued(){
        return issued;
    }

    // Check Methods
    int isAvailable(String book){
        for(int i=0;i<avaliable;i++){
            if(book.equalsIgnoreCase(avaliableBooks[i]))
                return i;
        }
        return -1;
    }

    int isIssued(String book){
        for(int i=0;i<issued;i++){
            if(book.equalsIgnoreCase(issuedBooks[i]))
                return i;
        }
        return -1;
    }

    boolean isMaxIssued(){
        if(getIssued() == 500)
            return true;
        else
            return false;
    }

    // Book Methods from here
    void issueBook(String book){
        int index = isAvailable(book);
        if(index >= 0){
            if(!(isMaxIssued())){
                issuedBooks[issued] = book;
                ++issued;
                for(int i=index;i<avaliable;i++)
                    avaliableBooks[i] = avaliableBooks[i+1];
                --avaliable;
                System.out.println(book + " has been successfully issued to you. Enjoy reading it!");
            }
            else
                System.out.println("Maximum Issue Limit crossed!");
        }
        else
            System.out.println(book + " is currently not avaliable");
    }

    void returnBook(String book){
        int index = isIssued(book);
        if(index >= 0){
            avaliableBooks[avaliable] = book;
            avaliable++;
            for(int i=index;i<issued;i++)
                issuedBooks[i] = issuedBooks[i+1];
            issued--;
            System.out.println(book + " has been returned back successfully. Hope you enjoyed reading it!");
        }
        else
            System.out.println("You are returning a Non-Issued Book. Please look carefully which book you want to return");
    }

    void addBook(String book){ 
            avaliableBooks[avaliable] = book;
            avaliable++;
            System.out.println(book + " has been added successfully. We are very happy that you helped our Library by giving this book to us.");
    }

    void showAllBooks(){
        System.out.println("\nAvaliable books are :-");
        for(int i=0;i<avaliable;i++){
            if(i==avaliable-1)
                System.out.print(avaliableBooks[i]);
            else
                System.out.print(avaliableBooks[i] + ", ");
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) throws IOException {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int ch=0;
        String book = "";

        outer: while(true){
            System.out.print("\nEnter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): ");
            try{ch=sc.nextInt();} catch(Exception e){System.out.println("Invalid value entered"); System.exit(0);}

            if((ch >= 1 && ch <= 3) && (ch!=4)){
            System.out.print("\nEnter name of the book here: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            book = br.readLine();
            }
            switch (ch) {
                case 1:
                    lib.issueBook(book);
                    break;
                case 2:
                        lib.returnBook(book);
                        break;
                case 3:
                    // This is done because if a book is taken it must be returned back and the space of the issued might not be taken by a new book
                    if(lib.getAvailable() + lib.getIssued() < 500)
                        lib.addBook(book);
                    else
                        System.out.println("Thanks for offering us this book but we are currently running out of space.");
                    break;
                case 4:
                    lib.showAllBooks();
                    break;
                case 5:
                    break outer;
                case 6:
                    System.out.println("\nOnline Library Management is place where you can issue, add and return a book virtually which is avaliable in the Library.");
                    System.out.println("No real books will be given. So if you thought real books will be given then 2 minat ka mon wrat apke naam");
                    break;
            
                default:
                    System.out.println("You have gone out of range. Please Enter only in the range of 1 to 6 to see some result");
            }
        }
        sc.close();
    }
}