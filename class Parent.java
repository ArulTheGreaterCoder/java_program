class Parent
{ int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name:"+name);
    }
}
class child extends Parent
{
    void ageN(int age){
        System.out.println("Age of the student is:"+age);
    }
}
class Main{
    public static void main(String[] args){
        child s = new child();
        s.naming("Aashish");
        s.ageN(14); 
    }
}