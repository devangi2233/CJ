class Parent{
    void show(){
        System.out.println("Parent's show()");
    }
}
class Child extends Parent{
    void show(){
        super.show();
        System.out.println("Child show()");
    }
}
class Overriding{
    public static void main(String args[]){
        Child obj2 = new Child();
        obj2.show();
    }
}