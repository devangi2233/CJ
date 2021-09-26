import java.util.Scanner;

class SimpleGame{
    public static void main(String args[]){
    int a , seconds;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
            System.out.println("1. Sum of digits\n");
            System.out.println("2. Convert seconds to time\n");
            System.out.println("3. Exit\n");
            choice = scan.next().charAt(0);

            switch(choice)
            {
                case '1' : 
                System.out.println("Enter number : ");
                a = scan.nextInt();
                SumDigit game1 = new SumDigit();
                game1.sumDigit();
                break;

                case '2' : System.out.println("Input Seconds : ");
                seconds = scan.nextInt();
                ConverTime game2 = new ConverTime();
                game2.convertTime();
                break;

                case '3' : System.exit(0);
                break;

                default : System.out.println("Wrong choices");
           }
    }
}


class SumDigit{
    int sumDigit(int digit, int sum, int a){
               while(a > 0){
                   sum = 0;
                    digit = a % 10;  
                    sum = sum + digit;  
                    a = a / 10;  
                }
                return(sum);
           }

}

class ConverTime{
    int convertTime(int seconds){
               int p1 = seconds % 60;
                int p2 = seconds / 60;
                int p3 = p2 % 60;
                p2 = p2 / 60;
                return(p2 + ":" + p3 + ":" + p1);
           }

}
           

           
    

