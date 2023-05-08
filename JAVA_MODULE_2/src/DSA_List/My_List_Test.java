package DSA_List;

public class My_List_Test {
    public static void main(String[] args) {
        My_List<Integer> integerMyList = new My_List<Integer>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(6);
        integerMyList.add(4);
        System.out.println("Elemennt 4: " + integerMyList.get(4));
        System.out.println("Elemennt 1: " + integerMyList.get(1));
        System.out.println("Elemennt 2: " + integerMyList.get(2));
    }
}
