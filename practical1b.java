import java.util.Scanner;
import java.lang.Math;

class practical1b{
    public static void main(String args[]){
        float a, b, c, d, x;
        Double x1, x2;
        System.out.println("Enter a, b and c : ");
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        System.out.println("Coefficients of a : "+a+ " b : "+b+" c : "+c);
        d = b * b - 4 * a *c;
        if (d>0){
            x1 = (-b + Math.sqrt(d))/ 2 * a;
            x2 = (-b - Math.sqrt(d))/2 * a;
            System.out.println("Roots are real and unequal");
            System.out.println("X1 : " + x1);
            System.out.println("x2 : " + x2);
        }
        else if(d == 0){
            x = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("x : "+ x);

        }
        else{
            System.out.println("Roots are complex");
        }
        
    }
}