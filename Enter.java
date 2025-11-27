class Animal{
    void eat(){
        System.out.println("Eating eat class.");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Roar Lion Roar method.");
    }
}
class BabyLion extends Lion{
    void weep(){
        System.out.println("Weep Lion Weep Method.");
    }
}
class Enter{
    public static void main(String args[]){
        BabyLion c = new BabyLion();
        c.weep();
        c.roar();
        c.eat();
    }
}