                                           DOCUMENTATION

Problem Statement 

- The goal of this project is to create a soccer league management system where we simulate a tournament with n number of university teams ranging from a minimum of 2 to a maximum of 8 teams. 

- Once you run the code, the program will ask the user to input the number of teams partaking in the tournament and the user must type in a number between 2 and 8 inclusive. 

- If there are an odd number of teams, then one team at random depending on the draw will receive a bye and get a free pass to the second round. The tournament is run in a knock out format where each winning team moves to the next round to play against the winner of the previous round on the other side of the bracket. 

- There is no consolation match in the tournament, this means losing teams will not play for 3rd place, if you’re out you’re out. Once the finals have been played, the program also displays the individual player stats of the winning team, giving them a rating out of 100. 


Design Process - Description Of Program Structure

- The first part of designing the program was deciding what tournament format we were going to use. We initially settled on a round robin type format because this way we could get each team to play twice, once on their own ground and one away which would follow the default instructions of the assignment, but instead we went with a knockout format because we found it to be less complex. 

- Then we had to define classes where we stuck to the most basic outline that’s needed to run a soccer league. This includes a Player class, TeamNameGenerator class, a Team class and a Matches class. 

- The Player class has a string array of player names and 2 functions, one that just returns a player’s name at random and another that returns a random integer value for the said player’s skill. 

- In the TeamNameGenerator class, there exists a number of university team names in the form of an arraylist of strings. Within this class, there is a function that gets a university team’s name and removes it from the array. 

- The Team class is where players from the Player class get put in a team at random, this is done by calling the TeamNameGenerator class. There is a for - loop ensuring that the strength of each team does not exceed 11.

- The Matches class contains an arraylist of all the teams and numerous for - loops and if - statements addressing different outcomes of the matches and will print the winning team and their respective players’ skill ratings once every outcome is simulated. 

- After completing the project using arraylists, we ran into a roadblock which was fulfilling the use of a recursive data structure so we created a second project with RDS replacing some of the arraylists in the original project, using recursion. 

Task Allocation

- Alberto Meucci planned the project, he was mainly responsible for coming up with the format of the tournament and the recursive data structure. He did the Matches class, which involved coding several for-loops and if-statements to simulate the tournament matches and its outcomes. 

- John helped make this collaboration possible by creating a repository in Github where group members can ‘push’ their code from VS Code to the repository, allowing other members to see it(similar to a google doc in some ways), he constantly monitored the repository and would raise queries about certain bits of code if he felt necessary. 

- Harrison Cove and John helped Alberto with the coding, by creating the class files and adding objects and methods while also checking and modifying his code where necessary. They were responsible for the various functions making them less convoluted. Harrison came up with University team names and John did the player names and the functions to go with it. 

- The person with the least experience in java programming, Siddharth Thirumalai Kumar was left to do the documentation of the project and the UML diagrams. All members of the group did the comments of the project, to make it easier to read and understand. 


How To Run the Program 

- Once you run the code by clicking on the triangle button on the top right in vs code, the program will ask the user to input the number of teams partaking in the tournament and the user must type in a number between 2 and 8 inclusive. 


