public class HierarchialInheritance {
    public static void main(String args[]){
        Mammals dogs = new Mammals();
        dogs.eats();
        Birds parrot = new Birds();
        parrot.breath(); 
    }
}
class Animal{
    void breath(){
        System.out.println("Breaths");
    }
    void eats(){
        System.out.println("Eats");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("Flys");
    }
}
class Mammals extends Animal{
    void walks(){
        System.out.println("Walks");
    }
}
