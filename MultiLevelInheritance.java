public class MultiLevelInheritance {
    public static void main(String args[]){
        Dogs husky = new Dogs();
        husky.eats();
        husky.legs = 4;
        System.out.println(husky.legs);
    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("Breaths");
    }
}
class Mammals extends Animal{
    int legs;
}
class Dogs extends Mammals{
    String breed;
} 
