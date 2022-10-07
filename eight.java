import java.util.Scanner;

// 8. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.


class Average
{
    void calculate()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the values of a, b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        float avg=(a+b+c)/3;

        System.out.println("Average of three number is:"+avg);
        sc.close();
    }   
}

public class eight {
    public static void main(String[] args) {
        
        Average avrg=new Average();

        avrg.calculate();
    }
}
