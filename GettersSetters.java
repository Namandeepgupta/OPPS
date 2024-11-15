public class GettersSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println("Color: " + p1.getcolor());
        p1.setTip(5);
        System.out.println("Tip: " + p1.gettip());
    }
}
class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setcolor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}
