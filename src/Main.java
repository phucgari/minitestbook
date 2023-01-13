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
        double totalPrice=0;
        int countProgrammingBookJava=0;
        int countFictionVientuong1=0;
        int countFictionLowPrice=0;
        for (Book book:books) {
            if(book instanceof ProgrammingBook&&((ProgrammingBook)book).getFramework()=="Java"){
                countProgrammingBookJava++;
            }
            if(book instanceof FictionBook&&((FictionBook)book).getCategory()=="Viễn tưởng 1"){
                countFictionVientuong1++;
            }
            if(book instanceof FictionBook&&book.getPrice()<100){
                countFictionLowPrice++;
            }
            totalPrice+=book.getPrice();
        }
        System.out.println("Java book number "+countProgrammingBookJava);
        System.out.println("vien tuong book number "+countFictionVientuong1);
        System.out.println("Fiction lowprice number "+countFictionLowPrice);
        System.out.println("total price 10 books "+totalPrice);
    }
}