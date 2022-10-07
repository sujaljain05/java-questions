import java.util.Scanner;

// 5. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.

class Student
{
    void details(int a,int b,int c)
    {
        int area=(a+b)/2;
        int perimeter=a+b+c;
        System.out.println("Area of triangle is:"+area);
        System.out.println("Perimeter of triangle is:"+perimeter);
    }
}

public class five {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        Student st=new Student();
        st.details(a, b, c);
        sc.close();
    }
}
