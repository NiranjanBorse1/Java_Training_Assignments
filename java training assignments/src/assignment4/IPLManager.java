package assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IPLManager implements IPL {

    private Map<String,Teams> teams;

    public IPLManager()
    {
        teams=new HashMap<>();
    }

    public void addTeam(String name,Teams team)
    {
        teams.put(name.toUpperCase(),team);
    }

    @Override
    public void displayTeam(String team) throws TeamNotFoundException
    {
        Teams t=teams.get(team.toUpperCase());

        if(t==null)
            throw new TeamNotFoundException("Team does not exist");

        t.display();
    }
}