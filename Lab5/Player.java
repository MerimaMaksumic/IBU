

public class Player {
    private String name; 
    private int numberOfGoals; 
    
    public Player(String newName){
        this.name = newName; 
    }
    
     public Player(String newName, int newNumberOfGoals){
        this.name = newName; 
        this.numberOfGoals = newNumberOfGoals;
    }
     
     public String getName(){
         return this.name;
     }
     
     public int goals(){
        
         return this.numberOfGoals;
     }
     
     public String toString(){
         return "Player: " +  this.name + " goals: " + this.numberOfGoals;
     }
}