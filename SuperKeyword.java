public class SuperKeyword {
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
class Animal{
    String color;
}
class Horse extends Animal{
    Horse(){
        super.color = "Brown";
    }
}