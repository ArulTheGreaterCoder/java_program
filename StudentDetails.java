class Student{
    int id;
    String name;
    float sptiend;
    Student() {}
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student(int id, String name, float sptiend){
        this.id = id;
        this.name = name;
        this.sptiend = sptiend;
    }
    void displayDetails(){
        System.out.println(this.id+'|'+this.name+'|'+this.sptiend);
    }
}
class StudentDetails{
    public static void main(String[] args){
        Student stu1 = new Student();
        Student stu2 = new Student(45, "Aashish");
        Student stu3 = new Student(234, "Cody", 10000);
        stu1.displayDetails();
        stu2.displayDetails();
        stu3.displayDetails();
    }
}