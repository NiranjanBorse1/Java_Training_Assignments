package assignment4;

public class Teams {

    private String teamName;
    private Player players[];

    public Teams(String teamName,Player players[])
    {
        this.teamName=teamName;
        this.players=players;
    }

    public void display()
    {
        System.out.println("\nTeam : "+teamName);

        for(Player p:players)
            p.show();
    }
}