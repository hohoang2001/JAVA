package L1;

public class Car extends vehicles implements Run{
    @Override
    public String run() {
        return "Chạy Mòn Lốp";
    }

    @Override
    public String name() {
        return "Xe Honda";
    }
}
