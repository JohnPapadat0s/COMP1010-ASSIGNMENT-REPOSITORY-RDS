package SRC;

import java.util.Random;

public class Players {
     Random random = new Random();
     int playerSkill = random.nextInt(100);
     public String playerName;

     public Players(int playerSkill, String playerName){
        this.playerSkill = playerSkill;
        this.playerName = playerName;
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


