    //Main application demonstrates the use of RealEstate and Apartment classes with sorting and searching

public class MainApp{
    
    public static void main(String[] args){
        try{
            //listings includes houses and apartments
            RealEstate[] listings = new RealEstate[6];
            listings[0] = new RealEstate("Gaborone", "Tsholofelo East", 4, 5900, 4);
            listings[1] = new RealEstate("Gaborone", "Block 7", 3, 7600, 5);
            listings[2] = new Apartment("Jwaneng", "Pilane", 2, 6500, 2, 2);
            listings[3] = new RealEstate("Gaborone", "Tsholofelo East", 3, 10500, 6);
            listings[4] = new Apartment("Francistown", "Bloack 9", 3, 5000, 4, 3);
            listings[5] = new RealEstate("Molepolole", "Maokane", 5, 12000, 8);
        

            System.out.println("Original listings:");
            dislayListings(listings);

            //sort listings by price
            RealEstateManager.selectionSortByPrice(listings);
            System.out.println("\n Listings Sorted by Price:");
            displayListings(listings);

            //sort listings by rating 
            RealEstateManager.insertionSortByRating(listings);
            System.out.println("\n Listings Sorted by Rating:");
            displayListings(listings);

            //Linear search by Suburb
            String targetSuburb = "Block 7";
            int linearIndex = RealEstateManager.linearSearchBySuburb(listings, targetSuburb);
            System.out.println("\nLinear Search for Suburb " + targetSuburb + ":");
            if(linearIndex != -1) {
                System.out.println("House found in " + listings[linearIndex]);
            } else {
                System.out.println(" Not found.");
            }
        }
    }
}