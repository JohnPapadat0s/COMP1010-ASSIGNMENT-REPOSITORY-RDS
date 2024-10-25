package SRC;
import java.util.Random;

public class Players {
    Random random = new Random();
     int playerSkill = random.nextInt(100);
     public String playerName;
     Players next;

     public Players(Players next){
        playerName = getRandomPlayerName();
        this.next = next;
     }

     public static String getRandomPlayerName() {
        Random random = new Random();
        //This is the list of all possible names that can be chosen from
        String[] Playernames = {
            "Jon Doe", "Alberto Rossi", "Harry Smith", "Sid Brown", "James Taylor", "Michael Johnson", "David Williams", "Chris Davis", "Daniel Martinez", 
            "Ryan Wilson", "Nick Moore", "Andrew Anderson", "Jason Thomas", "Alex Jackson", "Matthew White", "Ethan Harris", "Samuel Lewis", "Oliver Clark", 
            "Ben Walker", "Liam Hall", "Kevin Young", "Scott King", "Adam Wright", "Peter Green", "Mark Baker", "Eric Nelson", "Lucas Hill", "Joseph Scott", 
            "Anto Adams", "Jacob Baker", "Thomas Murphy", "Jaiden Brown", "Alessio Russo", "Nathaniel Reed", "Isaac Ward", "Caleb Morgan", "Simon Bailey", 
            "Victor Diaz", "Owen Hughes", "Julian Peterson", "Mason Nguyen", "Gavin Price", "Charlie Perry", "Henry Butler", "Zachary Bennett", "Dylan Ross", 
            "Aiden Collins", "Max Mitchell", "Tristan Foster", "Sebastian Hall", "Felix James", "Jett Carter", "Leo Reed", "Nathan Clark", "Cole Rogers", 
            "Jason Parker", "Isaac Anderson", "Grant Anderson", "Tyler Palmer", "Marcus Martinez", "Jude Edwards", "Evan Brooks", "Blake Sanders", "Ashton Torres"  
        };

        //Here the players name is returned, it returns a random string from the Playernames array return Playernames[], 
        //and it chooses a random number between 1 and the size of the Playernames array, random.nextInt(Playernames.length)
        //Returning the string which corresponds to the number in the array
        return Playernames[random.nextInt(Playernames.length)];
    }

     //This is a function called in Team, i was testing to see if the names were randomised, just returns a players name
     public String getName(){
      return playerName;
     }

     //This is a function called in Team, i was testing to see if the skills were randomised, just returns a players skill
     public int getSkill(){
      return playerSkill;
     }
}
