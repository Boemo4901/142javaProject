public class RealEstateManager {

    //Sorting by Price
    public static void selectionSortByPrice(RealEstate[] listings) {
        for(int i = 0;i < listings.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < listings.length; j++) {
                if(listings[j].getPrice() < listings[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            RealEstate temp = listings[i];
            listings[i] = listings[minIndex];
            listings[minIndex] = temp;
        }
    }

    //Sort by Rating
    public static void insertionSortByRating(RealEstate[] listings) {
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

    public static int linearSearchBySuburb(RealEstate [] listings, String suburb ){
        for(int i = 0; i < listings.length; i++){
            if (listings[i].getSuburb().equalsIgnoreCase(suburb)){
                
                return i;
            }
        }
        return -1;
    }

    //binary search by price

    public static int binarySearchBYPrice(RealEstate[] listings , int price) {
        int left = 0, right = listings.length - 1;
        while (left <= right){
            int mid = (left + right ) / 2;
            int current = listings[mid].getPrice();

            if (current == price)  return mid ;
            if (current < price)  left = mid + 1;
            else right = mid - 1;

        }
        return - 1;
    }
}
