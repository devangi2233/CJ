class LogicalOperator{
    public static void main(String args[]){
        int a = 10, b = 5, c= 8, d = 2;
        boolean bool1 = a > b && c > d;
        boolean bool2 = a < b && c > d;
        boolean bool3 = a < b || c > d;
        boolean bool4 = ! (a - b == c);
        System.out.println("a > b && c > d = "+ bool1);
        System.out.println("a < b && c > d = "+ bool2);
        System.out.println("a < b || c > d = "+ bool3);
        System.out.println("! (a - b == c) = "+ bool4);
    }
}