package point;

public class Point2d {
    private double x,y;
    public Point2d(){

    }

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
    double[] arr = new double[] {x,y};
    return arr;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }
}
