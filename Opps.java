public class Opps{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.Color);
        p1.Color = "red";
        System.out.println(p1.Color);
        p1.setTip(5);
        System.out.println(p1.Tip);
    }
}
class Pen{
    String Color;
    int Tip;

    void setColor(String newColor){
        Color = newColor;
    }
    void setTip(int newTip){
        Tip = newTip;
    }
}
