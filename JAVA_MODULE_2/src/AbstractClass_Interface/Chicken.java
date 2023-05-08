package AbstractClass_Interface;

import com.sun.org.apache.bcel.internal.generic.PUSH;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken ";
    }
    @Override
    public String howtoEat(){
        return "coubr;";
    }
}
