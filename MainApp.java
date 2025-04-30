import java.util.Scanner;

public class MainApp{
    
    public static void main(String[] args){

        RealEstate estate= new RealEstate();
        RealEstateManager manager = new RealEstateManager();

        Scanner scanner = new Scanner(System.in);
        int option;
        try{

            do{

        
            RealEstate[] listings = new RealEstate[5];
            listings[0] = new RealEstate("Gaborone", "Tsholofelo East", 4, 5900, 4);
            listings[1] = new RealEstate("Gaborone", "Block 7", 3, 7600, 5);
            listings[2] = new RealEstate("Jwaneng", "Pilane", 2, 6500, 2);
            listings[3] = new RealEstate("Gaborone", "Tsholofelo East", 3, 10500, 5);
            listings[4] = new RealEstate("Francistown", "Block 7", 3, 5000, 4);



            System.out.println("<<<<< MY APARTMENTS >>>>>");
            System.out.println("1.List available apartments");
            System.out.println("2.Search by name");
            System.out.println("3.Sort by rating");
            System.out.println("4.Search by price");
            System.out.println("<<<<<<<<<<<<<  >>>>>>>>>>>");


            option = scanner.nextInt();
            switch (option){
                case 1:
                   System.out.println("These are available apartments");
                   displayListings(listings);
                   break;

                   case 2:
                       System.out.println("Enter location");
                       String location = scanner.next();

                        //manager.linearSearchBySuburb(listings,location);

                        RealEstate foundEstate = manager.linearSearchBySuburb(listings, location);

                        foundEstate.info();

                        break;

                        case 3:
                            manager.insertionSortByRating(listings);
                            System.out.println();

                            
                            displayListings(listings);


                            break;

                            case 4:

                                System.out.println("Enter price");
                                double price=scanner.nextDouble();

                               int found= manager.binarySearchByPrice(listings, price);

                               System.out.println(found);

                                break;
                                  
                            }
               }
                  while(option!=4);
            }  catch (InvalidRatingException e) {
              System.out.println(" Error: " + e.getMessage());
        }
       
       } 

    public static void displayListings(RealEstate[] listings) {
        for (RealEstate r : listings) {
            System.out.println(r);
        }
    }
}
    
