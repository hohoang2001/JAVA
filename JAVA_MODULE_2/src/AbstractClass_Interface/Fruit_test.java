package AbstractClass_Interface;
public class Fruit_test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orage();
        fruits[1] = new Apple();
        for (Fruit frus:fruits) {
            System.out.println(frus.howtoEat());
        }
    }
}
