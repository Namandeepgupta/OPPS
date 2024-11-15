public class TypesOfConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Namandeep");
        Student s3 = new Student(25); 
    } 
}
class Student{
    private String name;
    private int roll;

    //non parameterzied
    Student(){
        System.out.println("Constructor is called....");
    }
    //parameterzied
    Student(String newname){
        this.name = newname;
        System.out.println("Name: " + name);
    }
    //parameterzied
    Student(int newroll){
        this.roll = newroll;
        System.out.println("Rollno.: " + roll);
    }
}