public class StaticKeyword1 {
    public static void main(String args[]){
        System.out.println("Student 1: " + 
        PercentageCalculator.percent(95, 95, 97));
        System.out.println("Student 2: " + 
        PercentageCalculator.percent(92, 99, 93));
    }
}
class PercentageCalculator{
    static int percent(int phy, int maths, int ch){
        return ( (phy+maths+ch)/3 );
    }
}

