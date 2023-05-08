package AbstractClass_Interface;

public class ComparableCircletest {
    public static void main(String[] args) {
        ComparableCircle[] cicle1 = new ComparableCircle[3];
        cicle1[0] = new ComparableCircle(3.7);
        cicle1[1] = new ComparableCircle();
        cicle1[2] = new ComparableCircle("red", false,3.5);
        System.out.println("Pre-sorted: ");
        for (ComparableCircle cicle:cicle1) {
            System.out.println(cicle);
        }
    }
}
