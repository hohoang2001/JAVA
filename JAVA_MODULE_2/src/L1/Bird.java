package L1;

public class Bird extends Animal implements Fly{
    @Override
    public String Flyable() {
        return "Bay Gãy Cánh";
    }

    @Override
    public String name() {
        return "Chim tu hú";
    }

    @Override
    public String Barkable() {
        return "Không thể sủa được";
    }
}
