class Student{
    int rollNumber;
    void getNumber(int n){
        rollNumber = n;
    }
    void putNumber()
    {
        System.out.println("Roll No : "+ rollNumber);
    }
}

class Test extends Student
{
    float part1, part2;
    void getMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }
    void putMarks(){
        System.out.println("Marks obtained");
        System.out.println("Part1 = "+part1);
        System.out.println("Part2 = "+part2);
    }
}

interface Sports
{
    float sportwt = 6.0F;
    void putwt();
}

class Results extends Test implements Sports
{
    float total;
    public void putwt()
    {
        System.out.println("Sports wt = "+sportwt);

    }
    void display(){
        total = part1 + part2 + sportwt;
        putNumber();
        putMarks();
        putwt();
        System.out.println("Total Score = "+total);

    }
}

class Multipleinher
{
    public static void main(String args[]){
        Results s1 = new Results();
        s1.getNumber(319);
        s1.getMarks(45.8F, 90.2F);
        s1.display();
    }
}