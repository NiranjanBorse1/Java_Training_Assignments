package assignment4;

public class Teams {

    String teamName;
    Player players[];

    Teams(String teamName, Player players[]) {
        this.teamName = teamName;
        this.players = players;
    }

    void displayTeam() {
        System.out.println("\nTeam: " + teamName);

        for (int i = 0; i < players.length; i++) {
            players[i].show();
        }
    }
}
