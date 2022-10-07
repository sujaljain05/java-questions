// 2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class student
{
    void name()
    {
        String name="John";
        System.out.println("Student name is:"+name);
    }
    void rollno()
    {
        int roll_no=2;
        System.out.println("Roll number is: "+roll_no);
    }
}

public class second {
    public static void main(String[] args) {
        
        student st=new student();
        st.name();
        st.rollno();

    }
}
