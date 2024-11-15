public class Constructor {
    public static void main(String args[]){
        Student Student1 = new Student("Namandeep");
    }
}
class Student{
    Student(String name){
        System.out.println("Constructor is called.....");
        System.out.println("Name: " + name);
    }
}
