public class MainApp{

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
