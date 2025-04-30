public class MainApp{

   //Linear search by Suburb
   String targetSuburb = "Block 7";
   int linearIndex = RealEstate.linearSearchBySuburb(listings, targetSuburb);
   System.out.println("\n Linear Search by Suburb " + targetSuburb + ":");
   if(linearIndex != -1) {
       System.out.println("house found in " + listings[linearIndex]);
   } else {
       System.out.println(" Not found.");
   }
}
