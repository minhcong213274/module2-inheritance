package point;

public class Main {
    public static void main(String[] args) {
        Point2d point2d = new Point3d(3,5,6);
        System.out.println(point2d);
        var point2d1 = (Point3d)point2d;
        point2d1.getZ();
        Point3d point3d = new Point3d(3,5,4);
        System.out.println(point3d);
    }
}
