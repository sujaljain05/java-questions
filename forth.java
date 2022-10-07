import java.util.Scanner;

// 4. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle
{
    void sides()
    {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the sides of triangle:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    int perimeter=a+b+c;
    System.out.println("Perimeter of triangle:"+perimeter);
    int area=(a*b)/2;
    System.out.println("Area of triangle:"+area);

    sc.close();
    }
}

public class forth {
    public static void main(String[] args) 
    {
        Triangle tri=new Triangle();
        tri.sides();
    }
}
