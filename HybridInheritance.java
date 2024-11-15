public class HybridInheritance {
    public static void main(String args[]){
        Peacock P1 = new Peacock();
        P1.eats();
        P1.flies();
        Human H1 = new Human();
        H1.walk();
        H1.breaths();s
    }
}
class Animal{
    void eats(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("Breaths");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}
class Tuna extends Fish{
    void name(){
        System.out.println("Tuna");
    }
}
class Shark extends Fish{
    void name(){
        System.out.println("Shark");
    }
}
class Bird extends Animal{
    void flies(){
        System.out.println("Flies");
    }
}
class Peacock extends Bird{
    void name(){
        System.out.println("Peacock");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammal{
    void name(){
        System.out.println("Dog");
    }
}
class Cat extends Mammal{
    void name(){
        System.out.println("Cat");
    }
}
class Human extends Mammal{
    void name(){
        System.out.println("Human");
    }
}
