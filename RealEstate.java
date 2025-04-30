/*
 * Class representing real estate properties
 * Handles property information including city, suburb, number of bedrooms, price and rating.
 */

public class RealEstate {
    private String city;
    private String suburb;
    private int bedrooms;
    private double price;
    private int rating;

    // Constructor to initialize a real estate property with all details
    public RealEstate(String city,String suburb,int bedrooms, double price,int rating) throws InvalidRatingException
    {
        if (rating < 1 || rating > 5){
            throw new InvalidRatingException("Rating must be between 1 and 5");
        }
        this.city = city;
        this.suburb = suburb;
        this.bedrooms = bedrooms;
        this.price = price;
        this.rating = rating;
    }
    
    //getters and setters
    public String getCity(){
        return city;
    }

    public String getSuburb(){
        return suburb;
    }

    public  int getBedrooms(){
        return bedrooms;
    }

    public double getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }

    //Returns a formatted string representation of the real estate property
    @Override
    public String toString() {
        return city + " , " + suburb + " with " + bedrooms + " bed(s) and is Priced at P" + price + " with a star rating of" + rating + "stars";
    }
}
