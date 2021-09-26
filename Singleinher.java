class Rectangle{
    int length;
    int breadth;
    Rectangle(int x, int y){
        length = x;
        breadth = y;
    }
    int area(){
        return (length * breadth);
    }
}
class Box extends Rectangle{
    int height;
    Box(int x, int y, int z){
        super(x, y);
        height = z;
    }
    int volume(){
        return (length * breadth * height);
    }
}
class Singleinher{
    public static void main(String args[]){
        Box t = new Box(14, 12, 10);
        int area1 = t.area();
        int volume1 = t.volume();
        System.out.println("Area : "+area1);
        System.out.println("Volume : "+volume1);
    }
}