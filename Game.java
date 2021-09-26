import java.util.Scanner;

public class Game{
    public static void main(String args[]){
        int a , seconds, res ;
        int digit, sum=0;
        char choice, ch;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1. Sum of digits\n");
            System.out.println("2. Convert seconds to time\n");
            System.out.println("3. Exit\n");
            choice = scan.next().charAt(0);

            switch(choice)
            {
                case '1' : System.out.println("Enter number : ");
                a = scan.nextInt();
                while(a > 0){
                    digit = a % 10;  
                    sum = sum + digit;  
                    a = a / 10;  
                }
                System.out.println("Sum of digits : "+sum);
                break;

                case '2' : System.out.println("Input Seconds : ");
                seconds = scan.nextInt();
                int p1 = seconds % 60;
                int p2 = seconds / 60;
                int p3 = p2 % 60;
                p2 = p2 / 60;
                System.out.print( p2 + ":" + p3 + ":" + p1);
		        System.out.print("\n");
                break;

                case '3' : System.exit(0);
                break;

                default : System.out.println("Wrong choices");
            }
            System.out.println("------------------------------\n");

        }while (choice != 3);
    }
}