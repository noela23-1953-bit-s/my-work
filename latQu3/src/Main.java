import java.util.List;
import java.util.ArrayList;
public class Main {

public static void main(String[] args) {
        Family pan = new Family("Fahad", "Alcoholic", "Ugandan");
        Family fan = new Family("Rashid", "Talkative", "Japanese");
        Family king = new Family("Jane", "Humble", "Congo Brazzaville");

        List<Family> families = new ArrayList<>();
        families.add(pan);
        families.add(fan);
        families.add(king);

        Home home = new Home("123 mukono", families);
        home.displayDetails();

        Family newFamily = new Family("Antonio", "bully", "jamaica");
        home.addLocation(newFamily);
        home.displayDetails();

        home.removeLocation(fan);
        home.displayDetails();

        System.out.println(fan);

        Home newHome = new Home("johnesburg", new ArrayList<>());
        newHome.addLocation(fan);
        newHome.displayDetails();
    }
}