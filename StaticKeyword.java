public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.Schoolname = "SSM";
        Student s2 = new Student();
        System.out.println(s2.Schoolname);
    }
}
class Student{
    String name;
    int rollno;

    static String Schoolname;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
