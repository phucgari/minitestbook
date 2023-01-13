import bookteam.Book;
import bookteam.FictionBook;
import bookteam.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book[] books=new Book[10];
        books[0]=new ProgrammingBook("basic",100,"mr.good","English","Java");
        books[1]=new ProgrammingBook("medium",200,"Mrs.good","France","Java");
        books[2]=new ProgrammingBook("advance",300,"mr.decent","Chinese","Java");
        books[3]=new ProgrammingBook("senior",400,"mrs.decent","Alien","Robotic");
        books[4]=new ProgrammingBook("master",500,"No name","God","Planet");
        books[5]=new FictionBook("Hell",80,"brother","Viễn tưởng 1");
        books[6]=new FictionBook("Paradise",90,"sister","good2");
        books[7]=new FictionBook("ground",100,"cousin","yeah3");
        books[8]=new FictionBook();
        books[9]=new FictionBook();

        System.out.println("Java book number "+countProgrammingBookJava(books));
        System.out.println("vien tuong book number "+countFictionVientuong1(books));
        System.out.println("Fiction lowprice number "+countFictionLowPrice(books));
        System.out.println("total price 10 books "+totalPrice(books));
    }
    public static double totalPrice(Book[] books){
        double totalPrice=0;
        for (Book book:books) {
            totalPrice+=book.getPrice();
        }
        return totalPrice;
    }
    public static int countProgrammingBookJava(Book[] books){
        int countProgrammingBookJava=0;
        for (Book book:books) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getFramework() == "Java") {
                countProgrammingBookJava++;
            }
        }
        return countProgrammingBookJava;
    }
    public static int countFictionVientuong1(Book[] books){
        int countFictionVientuong1=0;
        for (Book book:books) {
            if(book instanceof FictionBook&&((FictionBook)book).getCategory()=="Viễn tưởng 1"){
                countFictionVientuong1++;
            }
        }
        return countFictionVientuong1;
    }
    public static int countFictionLowPrice(Book[] books){
        int countFictionLowPrice=0;
        for (Book book:books) {
            if(book instanceof FictionBook&&book.getPrice()<100){
                countFictionLowPrice++;
            }
        }
        return countFictionLowPrice;
    }
}