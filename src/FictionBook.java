public class FictionBook extends Book {
    String category="";

    FictionBook(){
        super();
    }
    FictionBook(String n,double p,String a,String c){
        super(n,p,a);
        category=c;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
