package access_Modifier;

public class studen {
    private String name = "John";
    private String classes = "C02";
    public  studen(){
    }
    public void setname(String name){
        this.name = name;
    }
    public void setClasses( String classes){
        this.classes = classes;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
}
