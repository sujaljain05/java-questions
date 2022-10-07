import java.util.Scanner;

// 6. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


class Rectangle
{
    int Area1(int x,int y)
    {
        int area=x*y;
        return area;
    }
    int Area2(int a,int b)
    {
        int area=a*b;
        return area;
    }
}

public class sixth {
    public static void main(String[] args) {

        int x,y,a,b;
        Rectangle rec=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width and length of rectangle first is:");
        x=sc.nextInt();
        y=sc.nextInt();

        int result1=rec.Area1(x, y);
        System.out.println("Area of first rectangle is:"+result1);

        System.out.println("---------------------------------------------");
        System.out.println("Enter the width and length of rectangle second is:");
        a=sc.nextInt();
        b=sc.nextInt();

        int result2=rec.Area2(a, b);
        System.out.println("Area of first rectangle is:"+result2);
    

        sc.close();

    
    }
}
