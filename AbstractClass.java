public class AbstractClass {
    public static void main(String args[]){
        Mustang m = new Mustang();
        Horse h = new Horse();
        h.eats();
        h.walks();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eats();
        c.walks();
    }
}
abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        System.out.println("Animal Constructor is called.");
    }
    void eats(){
        System.out.println("Eats");
    }
    abstract void walks();
}
class Horse extends Animal{
    void walks(){
        System.out.println("Walks on 4 legs.");
    }
    void changecolor(){
        color = "Dark Brown";
    }
    Horse(){
        System.out.println("Horse Constructor is called.");
    }
}
class Chicken extends Animal{
    void walks(){
        System.out.println("Walks on 2 legs");
    }
    void changecolor(){
        color = "Yellow";
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called.");
    }
}
