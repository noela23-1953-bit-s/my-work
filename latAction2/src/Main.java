//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Father fat = new Father("Mike");
        Mother mot = new Mother("Deborah");
        Child chi= new Child("Mark");

        fat.performAction();
        mot.performAction();
        chi.performAction();

        fat.displayDetails();
        mot.displayDetails();
        chi.displayDetails();

        fat.displayDetails("father");
        mot.displayDetails("Mother");
        chi.displayDetails("son");

    }

}