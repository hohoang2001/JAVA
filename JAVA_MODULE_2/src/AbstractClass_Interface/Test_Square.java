package AbstractClass_Interface;

import inheritance.Rectangle;
import inheritance.Shape;
import inheritance.Square;

public class Test_Square {
    public static void main(String[] args) {
         Shape[] a = new Shape[2];
         a[0] = new Square(1.9);
         a[1] = new Rectangle();
         double ab = 5.3;
         int c = (int)ab;

        for (int i = 0; i < a.length; i++){
            if(a[i] instanceof Square){
                ((Square)a[i]).howtoColor();
            }
        }
    }
}
