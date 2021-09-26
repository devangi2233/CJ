import java.io.*;

class Area{
    int side
    float radius
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void getdata(int a, float b){
        side = a;
        radius = b;
    }

    int squArea(){
        int sqarea = side * side;
        return (sqarea);
    }
    int squPeri(){
        int sqperi = 4 * side;
        return (sqperi);
    }
    

}