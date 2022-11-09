//The University of Helsinki students use so-called Lyyra cards to pay for their meals in student cafeterias. In this assignment, we implement the class LyyraCard that simulates the Lyyra card.

public class exercise3 {
    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: The card has "+ cardPekka +" euros.");
        System.out.println("Brian: The card has "+ cardBrian +" euros.");
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: The card has "+ cardPekka +" euros.");
        System.out.println("Brian: The card has "+ cardBrian +" euros.");
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: The card has "+ cardPekka +" euros.");
        System.out.println("Brian: The card has "+ cardBrian +" euros.");
    }   
}
