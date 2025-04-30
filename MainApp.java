import java.util.Scanner;

public class MainApp{
    
    public static void main(String[] args){

        RealEstate estate= new RealEstate();
        RealEstateManager manager = new RealEstateManager();

        try{
            RealEstate[] listings = new RealEstate[5];
            listings[0] = new RealEstate("Gaborone", "Tsholofelo East", 4, 5900, 4);
            listings[1] = new RealEstate("Gaborone", "Block 9", 3, 7600, 5);
            listings[2] = new RealEstate("Jwaneng", "Pilane", 2, 6500, 2);
            listings[3] = new Apartment("Gaborone", "Phakalane", 3, 10500, 5,5);
            listings[4] = new Apartment("Francistown", "Block 7", 3, 5000, 4,2);
            
            Scanner scanner = new Scanner(System.in);
            int option;
            do{
                System.out.println("<<<<< MY APARTMENTS >>>>>");
                System.out.println("1>.List available properties");
                System.out.println("2>.Search by name/location");
                System.out.println("3>.Sort by rating");
                System.out.println("4>.Search by price");
                System.out.println("5>.Sort by price");
                System.out.println("6>.Exit");
                System.out.println("<<<<<<<<<<<<<  >>>>>>>>>>>");


            option = scanner.nextInt();
            switch (option){
                case 1:
                   System.out.println("These are available apartments");
                   displayListings(listings);
                   break;
                case 2:
                    System.out.println("Enter property location to look for");//search by location
                    String location = scanner.next();
                    int index = RealEstateManager.linearSearchBySuburb(listings, suburb);
                    if (index != -1){
                        System.out.println(" Found: " + listings[index]);
                    }else{
                        System.out.println("Sorry!! Search not Found!");
                    }
                        break;
                case 3:
                    manager.insertionSortByRating(listings);//sort ny rating
                    System.out.println();
                    displayListings(listings);
                    break;
                case 4:
                    System.out.println("Enter price"); //search by price
                    
                    double price=scanner.nextDouble();
                    int found= manager.binarySearchByPrice(listings, price);
                    
                    System.out.println(found);
                    
                    break;
                case 5:
                    RealEstateManager.selectionSortByPrice(listings);//sort by price
                    System.out.println(" Sorted by Price.");
                    System.out.print("NB : Sorted from highest to lowest");
                    displayListings(listings);
                    break; 
                case 6:
                    System.out.println(" EXITING...");
            }
               }while(option!=6);
            
            scanner.close();
            
        }  catch (InvalidRatingException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    } 

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
    
