public class RealEstateManager {

    public static insertionSortByRating(RealEstate[] listings) {
        for (int i = 1; i <listings.length; i++) {
            RealEstate key = listings[i];
            int j = i - 1;
            while (j >= 0 && listings[j].getRating() < key.getRating()){
                listings[j + 1] = listings[j];
                j--;
            }
            listings[ j + 1] = key;
        }
    }

    public static int linearSearchBySuburb(RealEstate [] istings, String suburb ){
        for(int i = 0; i < listings.length; i++){
            if (listings[i].getSuburb().equalsIgnoreCase(suburb)){
                
                return i;
            }
        }

        return -1;

   }
}
