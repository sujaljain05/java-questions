// 3. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Student
{
    void student1()
    {
        int roll_no=100;
        String name="Sam";
        long mob_no=8529193838L;
        String address="Noida Sector-55";
        
        System.out.println("Student name is:"+name);
        System.out.println("Student roll no is:"+roll_no);
        System.out.println("Student Mobile number is:"+mob_no);
        System.out.println("Student Address is:"+address);
    }
    void student2()
    {
        int roll_no=101;
        String name="John";
        long mob_no=8529193838L;
        String address="Noida Sector-56";
        
        System.out.println("Student name is:"+name);
        System.out.println("Student roll no is:"+roll_no);
        System.out.println("Student Mobile number is:"+mob_no);
        System.out.println("Student Address is:"+address);   
    }
}

public class third {
    public static void main(String[] args) {
        
        Student st=new Student();

        st.student1();
        System.out.println("--------------------------------------------");
        st.student2();
    }
    
}
