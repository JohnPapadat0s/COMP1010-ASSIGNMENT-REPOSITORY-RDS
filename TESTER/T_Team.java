package TESTER;


public class T_Team {
    T_Players Players;
    String TeamName;

    Boolean hasBeenChosen = false;
    Boolean hasWon = false;
    
    
    public T_Team(){
        
        for(int i = 0; i < 11; i++){
            Players = new T_Players(Players);
        } 
        TeamName = T_TeamNameGenerator.getRandomTeamName();//Will be a random variable from the arraylist of names

    }
}