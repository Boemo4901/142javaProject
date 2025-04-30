public class MainApp{
    public static void main(String[] args){
        try{
            //listings includes houses and apartments
            RealEstate[] listings = new RealEstate[6];
            listings[0] = newRealEstate("Gaborone", "Tsholofelo East", 4, 5900, 4);
            listings[1] = newRealEstate("Gaborone", "Bloack 7", 3, 7600, 5);
            listings[2] = newApartment("Jwaneng", "Pilane", 2, 6500, 2, 2, True);
            listings[3] = newRealEstate("Gaborone", "Tsholofelo East", 3, 10500, 6);
            listings[4] = newApartment("Francistown", "Bloack 9", 3, 5000, 4, 3, False);
            listings[5] = newRealEstate("Molepolole", "Maokane", 5, 12000, 8);
        

            System.out.println("Original listings:");
            dislayListings(listings);

            //sort by price
            RealEstateManager.selectionSortByPrice(listings);
            System.out.println("\n Listings Sorted by Price:");
            displayListings(listings);

            //sort by rating 
            RealEstateManager.insertionSortByRating(listings);
            System.out.println("\n Listings Sorted by Rating:");
            displayListings(listings);
        }
    }

   //Linear search by Suburb
   String targetSuburb = "Block 7";
   int linearIndex = RealEstateManager.linearSearchBySuburb(listings, targetSuburb);
   System.out.println("\n Linear Search for Suburb " + targetSuburb + ":");
   if(linearIndex != -1) {
       System.out.println("house found in " + listings[linearIndex]);
   } else {
       System.out.println(" Not found.");
   }
}
