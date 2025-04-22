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
}