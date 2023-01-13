public class Book {
    private static int counter=-1;
    private int code;
    private String name="";
    private double price=0;
    private String author="";
    Book(){
        code =++counter;
    }
    Book(String n,double p,String a){
        code=++counter;
        name=n;
        price=p;
        author=a;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCode() {
        return code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
