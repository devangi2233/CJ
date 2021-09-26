import java.util.*;

class Reverse{
    public static void main(String args[]){
        String s,t="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        s = in.nextLine();
        int length = s.length();
           for(int i=length-1;i>=0;i--)
           t = t + s.charAt(i);
        System.out.println("Reverse string "+t);
    }
}