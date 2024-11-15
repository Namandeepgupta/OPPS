public class ShallowCopy {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Namandeep";
        s1.rollno = 25; 
        s1.marks[0] = 99;
        s1.marks[1] = 97;
        s1.marks[2] = 96;
        Student s2 = new Student(s1);
        s1.marks[1] = 90;
        System.out.println("Name: " + s2.name);
        System.out.println("Rollno: " + s2.rollno);
        for(int i=0; i<3; i++){
            System.out.println("Marks " + (i+1) + " : " + s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollno;
    int marks[];

    Student(){
        marks = new int [3];
    }
    //Shallow copy
    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }
}
