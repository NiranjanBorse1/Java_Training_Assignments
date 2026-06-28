package assignment4;

public class Player {

    String name;
    double amount;

    Player(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    void show() {
        System.out.println(name + " - " + amount + " Cr");
    }
}
