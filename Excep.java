import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}
class Excep{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            if(age  < 18){
                throw new AgeException("You need to be an adult to vote");
            }
            else{
                System.out.println("You are eligible to vote");
            }
        }catch(Exception e){
            System.out.println("Exception occurred : "+e);
        }finally{
            System.out.println("Thank you");
        }
    }
}