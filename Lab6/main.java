import java.util.ArrayList;


public class main {

   
    public static void main(String[] args) {
        
      NightSky sky = new NightSky(0.1, 40, 10);
      sky.print();
      System.out.println("Number of stars: " + sky.starsInLastPrint());
     
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        
        System.out.println(cheese);
        
        Book nh1 = new Book("NHL Hockey", "Stanley Cup", 1952);
        
        Library l = new Library();
        l.addBook(cheese);
        l.addBook(nh1);
        l.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        l.addBook(new Book("Cheese Man", "Penguin Group", 1992));
        
        l.printBooks();
        
        ArrayList<Book> result = Library.searchByTitle("CHEESE");
        System.out.println("========");
        for(Book b : result){
            System.out.println(b);
        }
        
    }
    
}
