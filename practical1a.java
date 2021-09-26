class practical1a{
    public static void main(String args[]){
        float length, breadth, perimeter, area;
        length = Float.parseFloat(args[0]);
        breadth = Float.parseFloat(args[1]);
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle : "+perimeter);
        area = length * breadth;
        System.out.println("Area of rectangle : "+area);
    }
}