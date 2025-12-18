abstract class Objects {
    abstract void Showshape();
    public void shape(){
        System.out.println("I am from abstract class.");
    }
}
class Sphere extends Objects{
    void Showshape(){
        System.out.println("I am sphere.");
    }
}
class Cuboid extends Objects{
    void Showshape(){
        System.out.println("I am cuboid.");
    }
}
class Prism extends Objects{
    void Showshape(){
        System.out.println("I am prism.");
    }
}

public class Object{
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        obj.Showshape();
        Cuboid obj1 = new Cuboid();
        obj1.Showshape();
        Prism obj2 = new Prism();
        obj2.Showshape();
    }
}