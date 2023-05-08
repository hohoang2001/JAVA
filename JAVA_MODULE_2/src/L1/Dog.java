package L1;

public class Dog extends Animal implements Run, Swim{
    @Override
    public String run() {
        return "Chạy Mỏi Chân";
    }


    @Override
    public String swim() {
        return "Bơi Mỏi Chân";
    }

    @Override
    public String name() {
        return "Ú";
    }

    @Override
    public String Barkable() {
        return "Sủa Như Chó";
    }
}
