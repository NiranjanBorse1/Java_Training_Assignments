package assignment4;

import java.util.Scanner;

public class TestIPL {

    public static void main(String[] args) {

        IPLManager manager=new IPLManager();

        manager.addTeam("CSK",
                new Teams("CSK",new Player[]{
                        new Player("Dhoni",4),
                        new Player("Jadeja",18),
                        new Player("Gaikwad",18)
                }));

        manager.addTeam("MI",
                new Teams("MI",new Player[]{
                        new Player("Bumrah",18),
                        new Player("Hardik",16.35),
                        new Player("SKY",16.35)
                }));

        manager.addTeam("RCB",
                new Teams("RCB",new Player[]{
                        new Player("Kohli",21),
                        new Player("Patidar",11),
                        new Player("Hazlewood",12.5)
                }));

        manager.addTeam("KKR",
                new Teams("KKR",new Player[]{
                        new Player("Russell",12),
                        new Player("Narine",12),
                        new Player("Rinku",13)
                }));

        manager.addTeam("RR",
                new Teams("RR",new Player[]{
                        new Player("Sanju",18),
                        new Player("Jaiswal",18),
                        new Player("Parag",14)
                }));

        manager.addTeam("SRH",
                new Teams("SRH",new Player[]{
                        new Player("Cummins",18),
                        new Player("Klaasen",23),
                        new Player("Abhishek",14)
                }));

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Team Name : ");

        String team=sc.next();

        try
        {
            manager.displayTeam(team);
        }
        catch(TeamNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}