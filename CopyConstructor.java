public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Namandeep";
        s1.roll = 25;
        s1.pass = "Naman@2511";
        s1.marks[0] = 99;
        s1.marks[1] = 96;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s2.marks[2] = 97;
        s2.pass = "Naman@";
        System.out.println("For s1:-");
        System.out.println("Name: " + s1.name);
        System.out.println("Rollno.: " + s1.roll);
        System.out.println("Password: " + s1.pass);
        for(int i=0; i<3; i++){
            System.out.println("Marks of Subject " + (i+1) +": "+ s1.marks[i]);
        }
        System.out.println("For s2:-");
        System.out.println("Name: " + s2.name);
        System.out.println("Rollno.: " + s2.roll);
        System.out.println("Password: " + s2.pass);
        for(int i=0; i<3; i++){
            System.out.println("Marks of Subject " + (i+1) +": "+ s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    Student(){
        marks = new int[3];
    }
    
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.pass = s1.pass;
        this.marks = s1.marks;
    }
}
