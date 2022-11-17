



public class main {

    
    public static void main(String[] args) {
        
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        System.out.println("===================");
        
        barcelona.setName("Real Madrid");
        System.out.println("Team: " + barcelona.getName());
        
        System.out.println("===================");
        
        Player brian = new Player("Brian");
        System.out.println(brian);
        Player pekka = new Player("Pekka", 39);
        System.out.println(pekka);
        
        System.out.println("===================");
        
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        
        barcelona.printPlayers();
        
       /* System.out.println("===================");
        
        barcelona.setMaxSize(1);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.printPlayers();
        System.out.println("Number of players: " + barcelona.size());*/
        
       System.out.println("===================");
       
       System.out.println("Number of goals: " + barcelona.goals());
    }
    
}