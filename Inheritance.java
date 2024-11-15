public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.color ="blue";
        System.out.println(shark.color);
    }
}
class Animal{
    String color;
    
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}