package L1;

public class Plane extends vehicles implements Fly{
    @Override
    public String Flyable() {
        return "Bay Trên Bầu Trời";
    }

    @Override
    public String name() {
        return "Việt nam ờ lai";
    }
}
