package SRC;

import java.util.*;

//Making a seperate class is important here to make sure team names are not duplicated. 
public class TeamNameGenerator {
    // This is the Arraylist of all possible names that can be chosen from
    public static ArrayList<String> Teamnames = new ArrayList<>(Arrays.asList(
            "The University of Sydney", "The University of Queensland", "Griffith University", "Macquarie University",
            "The University of Western Australia",
            "James Cook University", "Victoria University", "The University of New South Wales",
            "The University of Adelaide", "The University of Tasmania",
            "Deakin University", "The University of Melbourne", "Australian National University", "La Trobe University",
            "University of South Australia",
            "Central Queensland University", "The University of Newcastle", "Southern Cross University",
            "Curtin University", "Charles Sturt University",
            "Federation University Australia", "Edith Cowan University", "Western Sydney University", "Bond University",
            "University of the Sunshine Coast",
            "The University of Notre Dame Australia", "Australian Catholic University",
            "University of Southern Queensland", "Griffith College",
            "Torrens University Australia", "Queensland University of Technology", "RMIT University",
            "University of Wollongong",
            "Melbourne Institute of Technology", "Open Universities Australia", "TAFE Queensland", "Curtin College",
            "Swinburne University of Technology",
            "Australian Institute of Music", "Australian College of Applied Psychology", "Box Hill Institute",
            "Monash University"));

    public static String getRandomTeamName() {
        Random random = new Random();
        // storing the team name in a temp variable.
        String tempTeamName = Teamnames.get(random.nextInt(Teamnames.size()));
        // Using the temp variable to remove the item from the arraylist and returning
        // the team name.
        Teamnames.remove(tempTeamName);
        return tempTeamName;
    }
}
