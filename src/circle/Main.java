package circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Cylinder(30,"blue",36);
        ((Cylinder)circle).volume();
        System.out.println(((Cylinder)circle).volume());
    }
}
