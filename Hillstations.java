class Hillstation {
    public void location(){
        System.out.println("Location is:");
    }
    public void famous(){
        System.out.println("Famous for:");
    }
}
class Manali extends Hillstation{
    public void location(){
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    public void famous(){
        System.out.println("It is famous for Hamdiba temple Temple and adventure sports.");
    }
}
class Gulmarg extends Hillstation{
    public void location(){
        System.out.println("Gulmarg is located in Himachal Pradesh");
    }
    public void famous(){
        System.out.println("It is famous for skiing.");
    }
}
public class Hillstations{
    public static void main(String[] args) {
        Hillstation A = new Hillstation();
        Hillstation Ma = new Manali();
        Hillstation Gu = new Gulmarg();
        A.location();
        A.famous();
        Ma.location();
        Ma.famous();
        Gu.location();
        Gu.famous();
    }
}