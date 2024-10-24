package TESTER;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class T_Tests {
    

    
    @Test
    public void testTeamCreation() {
        // Test that a team is created with 11 players
        T_Team team = new T_Team();
        assertNotNull(team);
        assertEquals(11, numOfPlayers(team.Players)); // Assuming players is a linked list of players
        assertNotNull(team.TeamName);
    }
    //creating the method to find how many players are in the linked list
    public static int numOfPlayers(T_Players first){
        if(first == null){
            return 0;
        }
        return 1+ numOfPlayers(first.next);
    }


    @Test
    public void testPlayerCreation() {
        // Test that players are assigned names and skills
        T_Players player = new T_Players(null);
        assertNotNull(player.getName());
        assertTrue(player.getSkill() >= 0); // Assuming skill is a non-negative integer
    }

    @Test
    public void testMatchSimulation() {
        // Test a match simulation between two teams
        T_Team team1 = new T_Team();
        T_Team team2 = new T_Team();
        T_Matches match = new T_Matches(team1, team2);
        assertNotNull(match); //Making sure the parameterised constructor can take two team objects correctly
    }



}
