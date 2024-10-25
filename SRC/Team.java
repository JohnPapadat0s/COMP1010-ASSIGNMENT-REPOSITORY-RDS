package SRC;


public class Team {
    Players Players;
    String TeamName;

    Boolean hasBeenChosen = false;
    Boolean hasWon = false;
    
    
    public Team(){
        
        for(int i = 0; i < 11; i++){
            Players = new Players(Players);
        } 
        TeamName = TeamNameGenerator.getRandomTeamName();//Will be a random variable from the arraylist of names

    }
}