package L1;

public class Fish extends Animal implements Swim{
    @Override
    public String swim() {
        return "Bơi Trong Chảo Lửa";
    }

    @Override
    public String name() {
        return "Cá 7 MÀU";
    }

    @Override
    public String Barkable() {

        return null;
    }
}
