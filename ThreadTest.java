class A extends Thread
{
    public void run(){
        System.out.println("thread A started");
        for(int i=1; i<=4; i++){
            System.out.println("\tFrom Thread A : i "+i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run(){
        System.out.println("thread B started");
        for(int j=1; j<=4; j++){
            System.out.println("\tFrom Thread B : j "+j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run(){
        System.out.println("thread c started");
        for(int k=1; k<=4; k++){
            System.out.println("\tFrom Thread k : k "+k);
        }
        System.out.println("Exit from c");
    }
}

class ThreadTest{
    public static void main(String args[]){
        new A().start();
        new B().start();
        new C().start(); 
    }
}

