import java.util.Scanner;

class ArithmeticOperator{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter number1 : ");
       float a = s.nextFloat();
       System.out.println("Enter number2 : ");
       float b = s.nextFloat();
       float result;
       result = a + b;
       System.out.println("number1 + number2 : "+result);

       result = a - b;
       System.out.println("number1 - number2 : "+result);

       result = a * b;
       System.out.println("number1 * number2 : "+result);

       result = a / b;
       System.out.println("number1 / number2 : "+result);

       result = a % b;
       System.out.println("number1 % number2 : "+result);
    }
}