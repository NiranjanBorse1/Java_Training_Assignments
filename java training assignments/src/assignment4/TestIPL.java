package assignment4;
import java.util.Scanner;
public class TestIPL {

    public static void main(String[] args) {

        Player csk[] = {
            new Player("Dhoni", 4),
            new Player("Jadeja", 18),
            new Player("Gaikwad", 18)
        };

        Player mi[] = {
            new Player("Bumrah", 18),
            new Player("Hardik", 16.35),
            new Player("SKY", 16.35)
        };

        Player rcb[] = {
            new Player("Kohli", 21),
            new Player("Patidar", 11),
            new Player("Hazlewood", 12.5)
        };

        Player kkr[] = {
            new Player("Russell", 12),
            new Player("Narine", 12),
            new Player("Rinku", 13)
        };

        Player rr[] = {
            new Player("Sanju", 18),
            new Player("Jaiswal", 18),
            new Player("Parag", 14)
        };

        Player srh[] = {
            new Player("Cummins", 18),
            new Player("Klaasen", 23),
            new Player("Abhishek", 14)
        };

        Teams t1 = new Teams("CSK", csk);
        Teams t2 = new Teams("MI", mi);
        Teams t3 = new Teams("RCB", rcb);
        Teams t4 = new Teams("KKR", kkr);
        Teams t5 = new Teams("RR", rr);
        Teams t6 = new Teams("SRH", srh);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter team (CSK, MI, RCB, KKR, RR, SRH):");
        String team = sc.next().toUpperCase();

        if (team.equals("CSK")) {
            t1.displayTeam();
        }
        else if (team.equals("MI")) {
            t2.displayTeam();
        }
        else if (team.equals("RCB")) {
            t3.displayTeam();
        }
        else if (team.equals("KKR")) {
            t4.displayTeam();
        }
        else if (team.equals("RR")) {
            t5.displayTeam();
        }
        else if (team.equals("SRH")) {
            t6.displayTeam();
        }
        else {
            System.out.println("Invalid Team");
        }

        sc.close();
    }
}
