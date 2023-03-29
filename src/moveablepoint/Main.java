package moveablepoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
