import java.awt.*;

public class Fruit {
    public final String shape="oval";
    
    public final void display Shape(){
        System.out.println("The shape of the fruit is :"+" "+shape);
    }
    public Fruit(String size){
        System.out.println("The fruit type is:"+" "+type);
    }
    public void rot(){
        System.out.println("The fruit is rotting..");
    }
}
class orange extends Fruit{
    String weight;
    public orange(String type, String taste){
        super(type);
        System.out.println("The taste is"+" "+taste);
    }

    @Override
    public void rotting() {
        super.rot();
        System.out.println("The fruit orange is rotting");
    }
}
