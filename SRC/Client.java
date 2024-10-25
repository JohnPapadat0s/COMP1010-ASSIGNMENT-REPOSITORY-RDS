package SRC;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        int numOfTeams = 0;
        Scanner chooseTeams = new Scanner(System.in);
        boolean isValid = false;

        // This code is to take the initial user input of how many teams they want. It
        // runs until isValid is true.
        while (!isValid) {
            try {
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                System.out.println("HOW MANY TEAM SHOULD PARTICIPATE IN THE TOURNAMENT?(min 2, max 8): ");
                numOfTeams = chooseTeams.nextInt();
                // Checks to make sure the integer imputed is within the valid range.
                if (numOfTeams <= 0) {
                    System.out.println("Please enter a positive integer!");
                    numOfTeams = chooseTeams.nextInt();
                }

                else if (numOfTeams < 2) {
                    System.out.println("At least 2 teams must participate!");
                    numOfTeams = chooseTeams.nextInt();
                }

                else if (numOfTeams > 8) {
                    System.out.println("A maximum of 8 teams can participate!");
                    numOfTeams = chooseTeams.nextInt();
                }
                isValid = true;
            }
            // Catches the error where a user may input a value that is not an integer.
            catch (InputMismatchException e) {
                System.out.println("Input is invalid, please enter an integer!");
                chooseTeams.next();
            }

        }
        chooseTeams.close();

        // Creating the teams based on what the user inputed and stores them in an
        // arrayList to be used when running match simulations.
        ArrayList<Team> allTeams = new ArrayList<>();
        for (int i = 0; i < numOfTeams; i++) {
            allTeams.add(new Team());
        }

        // Passing the arraylist of teams to the match class so that the match
        // simulations can be run.
        Matches Match = new Matches(allTeams);

    }

    public static String playersFromTeam(Team Test) {
        return Test.TeamName + "\n" + getplayers(Test.Players);
    }

    public static String getplayers(Players first) {
        if (first == null) {
            return "null";
        }
        return first.playerName + "  " + first.playerSkill + '\n' + getplayers(first.next);

    }

}
