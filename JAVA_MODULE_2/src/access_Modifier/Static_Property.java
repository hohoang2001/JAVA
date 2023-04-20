package access_Modifier;

public class Static_Property {
    private String name;
    private String engine;
    public static int numberOfcars;
    public Static_Property(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfcars++;
    }
    void display(){
        System.out.println(name + " " + engine );
    }

    public static void main(String[] args) {
        Static_Property car1 = new Static_Property("Mazda 3", "Skyactiv 3");
        System.out.println(Static_Property.numberOfcars);
        Static_Property car2 = new Static_Property("Mazda 6", "Skyactiv 6");
        System.out.println(Static_Property.numberOfcars);
        car1.display();
        car2.display();
    }
}
