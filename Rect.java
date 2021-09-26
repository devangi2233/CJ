class Rect{
    float length;
    float breadth;

    void getdata(float a, float b){
        length = a;
        breadth = b;
    }
    float rectarea(){
        float area = length * breadth;
        return (area);
    }

    public static void main(String args[]){
        float area1;
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        Rect r1 = new Rect();
        r1.getdata(x, y);
        area1 = r1.rectarea();
        System.out.println("Area is "+ area1);
    }
}