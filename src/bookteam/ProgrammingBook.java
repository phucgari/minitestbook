package bookteam;

public class ProgrammingBook extends Book{
    private String language="";
    private String framework="";
    public ProgrammingBook(){
        super();
    }
    public ProgrammingBook(String n,double p,String a,String l,String f){
        super(n,p,a);
        language=l;
        framework=f;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
