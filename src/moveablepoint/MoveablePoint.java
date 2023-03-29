package moveablepoint;

import point.Point2d;

public class MoveablePoint extends Point2d {
    double xSpeed,ySpeed;

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public double[] getSpeed(){
        double[] arr = new double[]{xSpeed,ySpeed};
        return arr;
    }
    public void setSpeed(double xSpeed,double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
    }

    @Override
    public String toString() {
        return "xy = (" + super.getX() +"," +super.getY() + ") speedXY =(" + xSpeed + "," + ySpeed + ")";
    }
}
