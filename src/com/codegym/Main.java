package com.codegym;
import java.lang.reflect.Array;
public class Main {

    public static void main(String[] args) {
        Point point;
        System.out.println();

        point = new Point(2,3);
        System.out.println(point);

        MoveablePoint movablePoint =new MoveablePoint();
        System.out.println(movablePoint);
        movablePoint =new MoveablePoint(5,2,3,4);
        System.out.println(movablePoint);

        movablePoint.setSpeed(4,5);
        movablePoint.move();
        System.out.println(movablePoint);


    }

}
