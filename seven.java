import java.util.Scanner;

// 7. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

class Area{
    
    int returnArea(int l,int w)
    {
        int area=l*w;
        return area;
    }
}

public class seven {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length and breadth of rectangle:");
        int l=sc.nextInt();
        int w=sc.nextInt();

        Area rec=new Area();

        int result=rec.returnArea(l, w);
        System.out.println("Area of the rectangle is:"+result);

        sc.close();
    }
}
