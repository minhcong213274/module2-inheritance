package point;

public class Point3d extends Point2d{
    private double z;

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double[] setXYZ(){
        double[] arr = new double[]{super.getX(),super.getY(),z};
        return arr;
    }
    public void getXYZ(double x,double y,double z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" + super.toString()+
                "z=" + z +
                '}';
    }
}
