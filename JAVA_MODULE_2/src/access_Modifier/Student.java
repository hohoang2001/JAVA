package access_Modifier;

public class Student {
    private int roolno;
    private String name;
    private static String college;
    Student(int r, String n){
        roolno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(roolno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(222, "Hoàng");
        Student s2 = new Student(333, "Thái");
        Student s3 = new Student(444, "Thắng");
        s1.display();
        s2.display();
        s3.display();
    }
}
