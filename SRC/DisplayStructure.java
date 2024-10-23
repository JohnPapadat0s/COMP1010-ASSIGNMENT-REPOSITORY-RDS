package SRC;

import java.util.ArrayList;

public class DisplayStructure {

    // This method outputs a team's details, including average skill and player ratings.
    public static void displayAll(Team team) {
        String teamName = team.teamName;
        ArrayList<Players> teamList = team.teamList;

        int teamSkillAVG = calculateAverageSkill(teamList);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(" ");
        // Just outputs the team name 
        System.out.println("Team Rating:   " + teamSkillAVG + ": " + teamName);
        System.out.println(" ");
        // Runs through the size of the teamList (All the players names that are also randomised)
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (Players player : teamList) {
            // Outputs the individual players' names from the list
            System.out.println("Player Rating: " + player.getSkill() + ": " + player.getName());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
        System.out.println("___________________________________________________________________________________________");
        System.out.println(" ");
    }

    // This method initiates the game display and determines the winners.
    public static void startGameDisplay(Team team1, Team team2, Team team3, Team team4) {
        System.out.println("___________________________________________________________________________________________");
        System.out.println(" ");
        System.out.println("The 4 teams playing in the Football tournament today are:");
        System.out.println(" ");
        System.out.println("   " + team1.teamName + "  -  " + team2.teamName + "  -  " + team3.teamName + "  -  " + team4.teamName);
        System.out.println(" ");
        System.out.println("Round 1: ");
        System.out.println(" ");
        System.out.println("   " + team1.teamName + "  vs  " + team2.teamName + "  &  " + team3.teamName + "  vs  " + team4.teamName);
        System.out.println(" ");
        

        // Team 1 vs Team 2
        Team winner1 = determineWinner(team1, team2);
        // Team 3 vs Team 4
        Team winner2 = determineWinner(team3, team4);
        
        System.out.println("Round 2: ");
        System.out.println(" ");
        System.out.println("   " + winner1.teamName + "  vs  " + winner2.teamName);
        System.out.println(" ");
        determineFinalWinner(winner1, winner2);
        System.out.println(" ");
    }

    // This method determines the winner between two teams based on their average skills.
    public static Team determineWinner(Team team1, Team team2) {
        int teamSkillAVG1 = calculateAverageSkill(team1.teamList);
        int teamSkillAVG2 = calculateAverageSkill(team2.teamList);

        if (teamSkillAVG1 >= teamSkillAVG2) {
            team1.hasWon = true;
            System.out.println("      Round 1 Winner: " + team1.teamName);

            System.out.println(" ");
            return team1;
        } else {
            team2.hasWon = true;
            System.out.println("      Round 1 Winner: " + team2.teamName);
            System.out.println(" ");
        }
            return team2;
    }

    public static void determineFinalWinner(Team team1, Team team2) {
        int teamSkillAVG1 = calculateAverageSkill(team1.teamList);
        int teamSkillAVG2 = calculateAverageSkill(team2.teamList);

        if (teamSkillAVG1 >= teamSkillAVG2) {
            team1.hasWon = true;
            System.out.println("      Round 2 Winner: " + team1.teamName);
            System.out.println(" ");
            displayAll(team1);
        } else {
            team2.hasWon = true;
            System.out.println("      Round 2 Winner: " + team2.teamName);
            System.out.println(" ");
            displayAll(team2);
        }
    }

    // This method calculates the average skill of a team based on its players.
    private static int calculateAverageSkill(ArrayList<Players> teamList) {
        int totalSkill = 0;
        for(int i = 0; i < 11; i++){
            totalSkill += teamList.get(i).getSkill();
        }
        return totalSkill / teamList.size(); // Ensure no division by zero
    }

}