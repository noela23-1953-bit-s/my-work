import java.util.List;
import java.util.ArrayList;

public class Home {
    private String addr;
    private List<Family> fams;

    public Home(String address, List<Family> fams) {
        this.address = address;
        this.fams = new ArrayList<>(fams);
    }

    public void addLocation(Family family) {
        fams.add(family);
    }
    public void clearLocation(Family family) {
        fams.remove(family);
    }

    public void displayDetails() {
        
        System.out.println("Address is: " + address);
        for (Family family : fams) {
            System.out.println(family);
        }
    }
}
