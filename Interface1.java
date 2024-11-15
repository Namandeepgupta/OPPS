public class Interface1 {
    public static void main(String args[]){
        Omnivore o1 = new Omnivore();
        o1.eats();
    }
}
interface Herbivore{
    public static void eats(){
        System.out.println("Eats Vegitarian food");
    }
}
interface Carnivore{
    public static void eats(){
        System.out.println("Eats Non Vegitarian food");
    }
}
class Omnivore implements Herbivore, Carnivore{
    public static void eats(){
        Herbivore.eats();
        Carnivore.eats();
    }
}
