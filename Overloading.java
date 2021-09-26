class methodDemo
{
    public void myMethod(){
        System.out.println("method without parameter");
    }
    public void myMethod(int x){
        System.out.println("method wirh int parameter");
    }
    public void myMethod(float y){
        System.out.println("method with float parameter");
    }
    public void myMethod(String s){
        System.out.println("method with string parameter");
    }
}
class Overloading{
    public static void main(String args[]){
        methodDemo d1 = new methodDemo();
        d1.myMethod();
        d1.myMethod(5);
        d1.myMethod(5.5f);
        d1.myMethod("hello");
    }
}