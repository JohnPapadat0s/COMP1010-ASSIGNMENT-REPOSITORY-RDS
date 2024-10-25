package SRC;
import java.util.*;


public class Matches {
    ArrayList<Team> allTeams;



    public Matches(ArrayList<Team> allTeams){
        this.allTeams = allTeams;
        
        
        System.out.println("___________________________________________________________________________________________");
        System.out.println("The teams playing in todays matches are:");
        for(int i = 0; i < allTeams.size(); i++){
            
            System.out.print("- " + allTeams.get(i).TeamName + " -");
        }
        System.out.println("");
        System.out.println("___________________________________________________________________________________________");
        simulatingMatches(allTeams);

       
    }
    public Matches(Team team1, Team team2){
        ArrayList<Team> allTeams = new ArrayList<>(Arrays.asList(team1,team2));
        System.out.println("___________________________________________________________________________________________");
        System.out.println("The teams playing in todays matches are:");
        for(int i = 0; i < allTeams.size(); i++){
            
            System.out.print("- " + allTeams.get(i).TeamName + " -");
        }
        System.out.println("");
        System.out.println("___________________________________________________________________________________________");
        simulatingMatches(allTeams);
    }




    public static void simulatingMatches(ArrayList<Team> allTeams){
        int round = 1;
        ArrayList<Team> teamsToRemove = new ArrayList<>();
        while (allTeams.size() > 1) {
            System.out.println("");
            System.out.println("");
            System.out.println("START ROUND "+ round + ": ");

            //set has won to false for all teams in the array list
            for(int i = 0; i < allTeams.size(); i++){
                allTeams.get(i).hasWon = false;
            }

            //if theres an odd number of teams in the arraylist, the last team will automatically pass to the next round.
            if(allTeams.size() % 2 != 0){
                allTeams.get(allTeams.size() -1).hasWon = true;
                System.out.println(allTeams.get(allTeams.size()-1).TeamName + " procedes to the next round due to an odd number of teams!");
                System.out.println("");
            }

            //Prints: team1 vs team2.
            for(int i = 0; i < allTeams.size() -1; i+= 2){
                System.out.println("- "+ allTeams.get(i).TeamName + " VS " + allTeams.get(i+1).TeamName + " -");
            }

            //After this loop all the teams that have won, now have the "hasWon" = true.
            for(int i = 0; i < allTeams.size()-1; i+=2){
                determineWinner(allTeams.get(i), allTeams.get(i+1));
            }

            //If hasWon is not true, remove the item from the arrayList.
            for (int i = 0; i < allTeams.size(); i++) {
                if (!allTeams.get(i).hasWon) {
                    teamsToRemove.add(allTeams.get(i));
                }
            }
            allTeams.removeAll(teamsToRemove);
            
            //Print the winners
            for(int i = 0; i < allTeams.size(); i++){
                System.out.println("");
                System.out.println("Round " + round + " winner: " + allTeams.get(i).TeamName);

            }
            /*This method shuffles the arrayList of the teams left in the tournament.
             * This is done to make it more fair incase of an odd number of teams.
             * e.g. Previously if 5 teams are in the tournament, the last team in the array skips strait to the finals.
             *      Now, the two teams who will skip games are random.
             */
            Collections.shuffle(allTeams);

            round = round + 1;

        }
        finalWinner(allTeams);
    }


// The final winner method. Prints out the final winners, team info, etc
    public static void finalWinner(ArrayList<Team> allTeams) {
        System.out.println("");
        System.out.println("___________________________________________________________________________________________");
        System.out.println("");
        System.out.println("THE TOURNAMENT WINNERS ARE: " + allTeams.get(0).TeamName);
        System.out.println("");
        System.out.println("___________________________________________________________________________________________");
        System.out.println("Here's their lineup for todays macthes: ");
        System.out.println("");
        for(Players temp = allTeams.get(0).Players; temp != null; temp = temp.next){
            System.out.println("");
            System.out.println("Player Skill: " + temp.playerSkill + "     Name: " +temp.playerName);
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        }
        
    }
// Determines the winner between two passed teams.
    public static void determineWinner(Team team1, Team team2) {
        int teamSkillAVG1 = getTeamTotal(team1);
        int teamSkillAVG2 = getTeamTotal(team2);

        if (teamSkillAVG1 >= teamSkillAVG2){
            team1.hasWon = true;
            
        } else {
            team2.hasWon = true;
        }
    }


// Uses two methods to sum the player score and return them based on the team.
    public static int getTeamTotal(Team Test){
        return sumScores(Test.Players);
    }
    public static int sumScores(Players first){
        if(first == null){
            return 0;
        }
        return first.playerSkill + sumScores(first.next);

    }

}

    
