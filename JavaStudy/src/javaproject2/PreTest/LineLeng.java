package javaproject2.PreTest;

import java.util.Random;
import java.util.Scanner;

class Point {
    private int xDot;
    private int yDot;

    Point(int xDot, int yDot) {
        this.xDot = xDot;
        this.yDot = yDot;
    }

    int getXDot() {
        return xDot;
    }
    int getYDot() {
        return yDot;
    }

}

class Line {
    Point p1;
    Point p2;
    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // xDot과 yDot 길이 구하는 메서드
    double leng() {
        return Math.sqrt(Math.pow(p1.getXDot() - p2.getXDot(), 2) + Math.pow(p1.getYDot() - p2.getXDot(), 2)); // p1, p2 선의 길이
    }

    public String toString() {
        return "두 점 (" + p1.getXDot() + "," + p1.getYDot() +"), (" + p2.getXDot()+"," +p2.getYDot()+") 사이의 길이는 " + leng();
    }
}

public class LineLeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//        Point p1 = new Point((int)(Math.random()*41 - 20),(int)(Math.random()* 41 - 20));
//        Point p2 = new Point((int)(Math.random()*41 - 20),(int)(Math.random()*41 - 20));
        Line[] lnArray = new Line[5];
        for(int i = 0; i < lnArray.length; i++) {
            Point p1 = new Point((int) (Math.random() * 41 - 20), (int) (Math.random() * 41 - 20));
            Point p2 = new Point((int) (Math.random() * 41 - 20), (int) (Math.random() * 41 - 20));
            lnArray[i] = new Line(p1, p2);
            System.out.println(lnArray[i]);
        }
    }

}
