import java.io.*;
class Employee
{
    String name;
    int id;
    int salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void get(){
        try{
            System.out.print("Enter ID : ");
            id = Integer.parseInt(br.readLine());
            System.out.print("Enter Name : ");
            name = br.readLine();
            System.out.print("Enter Salary : ");
            salary = Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void show(){
        System.out.println("ID is     : " + id);
        System.out.println("Name is   : "+ name);
        System.out.println("Salary is : "+salary);
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.get();
        e1.show();
    }
}