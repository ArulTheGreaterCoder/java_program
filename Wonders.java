class Wonder{
    public void Location(){
        System.out.println("Location is:");
    }
    public void Famous(){
        System.out.println("Famous for:");
    }
}
class Petra extends Wonder{
    public void Location(){
        System.out.println("Petra is located in Jordan.");
    }
    public void Famous(){
        System.out.println("An entire city carved into sandstone cliffs, famous for its Treasury (Al-Khazneh).");
    }
}
class Great_Wall_of_China extends Wonder{
    public void Location(){
        System.out.println("Great Wall of China is located in China.");
    }
    public void Famous(){
        System.out.println(" Massive ancient defensive wall, a symbol of Chinese engineering.");
    }
}
class Colosseum extends Wonder{
    public void Location(){
        System.out.println("Colosseum is located in Italy.");
    }
    public void Famous(){
        System.out.println("The largest ancient amphitheater ever built, used for gladiatorial contests.");
    }
}
class Manchu_Pichu extends Wonder{
    public void Location(){
        System.out.println("Manchu Pichu is located in Peru.");
    }
    public void Famous(){
        System.out.println("A breathtaking 15th-century Inca citadel high in the Andes Mountains.");
    }
}
class Christ_the_Redeemer extends Wonder{
    public void Location(){
        System.out.println("Christ the Redeemer is located in Brazil.");
    }
    public void Famous(){
        System.out.println("An iconic Art Deco statue of Jesus Christ overlooking Rio de Janeiro.");
    }
}
class Chichen_Itza extends Wonder{
    public void Location(){
        System.out.println("Chichen Itza is located in Mexico.");
    }
    public void Famous(){
        System.out.println("A large pre-Columbian city built by the Maya, featuring the El Castillo pyramid.");
    }
}
class Taj_Mahal extends Wonder{
    public void Locations(){
        System.out.println("Taj Mahal is located in India.");
    }
    public void Famous(){
        System.out.println("An ivory-white marble mausoleum, a masterpiece of Mughal architecture and a symbol of love.");
    }
} 
class Wonders{
    public static void main(String[] args){
        Wonder w = new Wonder();
        Wonder pe = new Petra();
        Wonder tj = new Taj_Mahal();
        Wonder ci = new Chichen_Itza();
        Wonder cr = new Christ_the_Redeemer();
        Wonder mp = new Manchu_Pichu();
        Wonder c = new Colosseum();
        Wonder gc = new Great_Wall_of_China();
        w.Location();
        w.Famous();
        pe.Location();
        pe.Famous();
        tj.Location();
        tj.Famous();
        ci.Location();
        ci.Famous();
        cr.Location();
        cr.Famous();
        mp.Location();
        mp.Famous();
        c.Location();
        c.Famous();
        gc.Location();
        gc.Famous();
    }
}
    
