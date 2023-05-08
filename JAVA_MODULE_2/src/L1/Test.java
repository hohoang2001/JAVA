package L1;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Fish();
        animals[2] = new Bird();
        vehicles[] vehicle = new vehicles[2];
        vehicle[0] = new Car();
        vehicle[1] = new Plane();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                System.out.println(((Dog) animals[i]).name());
                System.out.println(((Dog) animals[i]).run());
                System.out.println(((Dog) animals[i]).Barkable());
                System.out.println(((Dog) animals[i]).swim());
                System.out.println();
            } else if (animals[i] instanceof Fish) {
                System.out.println(((Fish) animals[i]).name());
                System.out.println(((Fish) animals[i]).swim());
                System.out.println();
            } else if (animals[i] instanceof Bird) {
                System.out.println(((Bird) animals[i]).name());
                System.out.println(((Bird) animals[i]).Flyable());
                for (L1.vehicles vehicles : vehicle) {
                    if (vehicles instanceof Car) {
                        System.out.println(((Car) vehicles).name());
                        System.out.println(((Car) vehicles).run());
                        System.out.println();
                    } else {
                        System.out.println(((Plane) vehicles).name());
                        System.out.println(((Plane) vehicles).Flyable());
                    }
                }
            }
        }
    }
}
