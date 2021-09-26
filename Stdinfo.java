import java.io.*;
class Student{
    String name;
    int rollno;
    int marks;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Student(){
        try{
            System.out.println("Enter the Rollno");
            rollno = Integer.parseInt(br.readLine());
            System.out.println("Enter the Name");
            name = br.readLine();
            System.out.println("Enter the Marks");
            marks = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
        void show()
        {
            System.out.println("Rollno is : "+rollno);
            System.out.println("Name is : "+name);
            System.out.println("Marks is : "+marks);
        }
    }
    class Stdinfo{
        public static void main(String args[]){
            Student s1 = new Student();
            s1.show();
        }
    
}