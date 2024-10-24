package TESTER;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

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
public void testValidNumberOfTeams() {
    // Test that the number of teams created is valid (between 2 and 8)
    int numOfTeams = 5; // Example input, can be any number for testing

    if (numOfTeams < 2 || numOfTeams > 8) {
        fail("Number of teams must be between 2 and 8.");
    }

    ArrayList<T_Team> teams = new ArrayList<>();
    for (int i = 0; i < numOfTeams; i++) {
        teams.add(new T_Team()); // Assuming T_Team has a default constructor
    }

    assertNotNull(teams);
    assertEquals(numOfTeams, teams.size());
}

@Test
public void testMaxNumberOfTeams() {
    // Test that the maximum number of teams (8) can be created
    int numOfTeams = 8;
    ArrayList<T_Team> teams = new ArrayList<>();
    
    for (int i = 0; i < numOfTeams; i++) {
        teams.add(new T_Team()); // Assuming T_Team has a default constructor
    }

    assertNotNull(teams);
    assertEquals(numOfTeams, teams.size());
}

    @Test
    public void testMultipleMatchesSimulation() {
        // Test simulation of multiple matches
        T_Team team1 = new T_Team();
        T_Team team2 = new T_Team();
        T_Team team3 = new T_Team();
        T_Matches match1 = new T_Matches(team1, team2);
        T_Matches match2 = new T_Matches(team2, team3);
        assertNotNull(match1);
        assertNotNull(match2);
    }
    @Test
    public void testPlayerSkillRange() {
        // Check that player skills are within a valid range
        for (int i = 0; i < 11; i++) {
            T_Players player = new T_Players(null);
            assertTrue(player.getSkill() >= 0 && player.getSkill() <= 100); // Assuming skill range
        }
    }

    @Test
    public void testTeamPlayersInitialization() {
        // Ensure that all players in a team are initialized
        T_Team team = new T_Team();
        T_Players currentPlayer = team.Players;
        for (int i = 0; i < 11; i++) {
            assertNotNull(currentPlayer);
            currentPlayer = currentPlayer.next;
        }
        assertNull(currentPlayer); // Ensure the end of the list is null
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

    @Test
    public void testTeamNameNotEmpty() {
        // Ensure that a team name is not empty
        T_Team team = new T_Team();
        assertFalse(team.TeamName.isEmpty());
    }

    @Test
public void testPlayerSkillPersistence() {
    // Test that the player's skill persists after creation
    T_Players player = new T_Players(null);
    int initialSkill = player.getSkill();
    assertEquals(initialSkill, player.getSkill());
}


}
