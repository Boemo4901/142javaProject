import java.util.Scanner;

/* Main application class fr managing real estate listings.
 * Provides a menu-driven interface for displaying, searching, and sorting properties.
 */

public class MainApp{
    public static void main(String[] args){
        try{
            RealEstate[] listings = new RealEstate[5];
            listings[0] = new RealEstate("Gaborone", "Tsholofelo East", 4, 5900, 4);
            listings[1] = new RealEstate("Gaborone", "Block 9", 3, 7600, 5);
            listings[2] = new RealEstate("Jwaneng", "Pilane", 2, 6500, 2);
            listings[3] = new Apartment("Gaborone", "Phakalane", 3, 10500, 5,5);
            listings[4] = new Apartment("Francistown", "Block 7", 3, 5000, 4,2);

            // Create scanner for user input
            Scanner scanner = new Scanner(System.in);
            int choice;
            do { 
                // Display menu options
                System.out.println("<<<<< MY APARTMENTS >>>>>");
                System.out.println("1>.List available properties");
                System.out.println("2>.Search by name/location");
                System.out.println("3>.Sort by rating");
                System.out.println("4>.Search by price");
                System.out.println("5>.Sort by price");
                System.out.println("6>.Exit");
                System.out.println("<<<<<<<<<<<<<  >>>>>>>>>>>");
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice){
                    case 1 -> {
                        System.out.println("These are available apartments");
                        displayListings(listings);
                    }
                
                    case 2 -> {
                        System.out.println("Enter suburb to search: ");//search by location
                        String suburb = scanner.nextLine();
                        int index = RealEstateManager.linearSearchBySuburb(listings, suburb);
                    
                        if (index != -1) {
                            System.out.println(" Found: " + listings[index]);
                        } else {
                            System.out.println("Sorry!! Search not Found!");
                        }
                    }
                
                    case 3 -> {
                        RealEstateManager.insertionSortByRating(listings);//sort ny rating
                        System.out.println("Sorted by Rating ");
                        displayListings(listings);
                    }
                
                    case 4 -> {
                   
                        RealEstateManager.selectionSortByPrice(listings); //sort before binary search
                        System.out.println("Enter price to search: ");
                        int price = scanner.nextInt();
                        int index = RealEstateManager.binarySearchByPrice( listings, price);
                        if ( index != -1) {
                            System.out.println("Found: " + listings[index]);
                        } else {
                            System.out.println("Not found.");
                        }
                    }
                    case 5 -> {
                        RealEstateManager.selectionSortByPrice(listings);//sort by price
                        System.out.println(" Sorted by Price.");
                        displayListings(listings);
                    }
                    case 6 -> System.out.println(" EXITING...");
                    default -> System.out.println(" Invalid choice.");
                }
            }while(choice!=6);
            scanner.close();
        } catch (InvalidRatingException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    } 
    /*
    * Displays all real estate listings with appropriate formatting.
     */
    public static void displayListings(RealEstate[] listings) {
        System.out.println("\n Availiable listings");
        for (RealEstate r : listings) {
            if (r instanceof Apartment){
                Apartment apt = (Apartment) r;
                System.out.println(" Apartment: "+ apt.toString()+" Floor: "+apt.getFloorLevel());
            }else {
                System.out.println(" House : "+r.toString());
            }
        }
    }
}
    
