import java.util.Scanner;

// 1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

class Area {
    int l, w;

    void setDim(int a, int b) {
        l = a;
        w = b;
    }

    int getArea() {
        return l * w;
    }
}

public class first {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int b = sc.nextInt();

        Area rec = new Area();
        rec.setDim(a, b);
        int area = rec.getArea();
        System.out.println("The area of rectangle is:" + area);
        sc.close();
    }
}
