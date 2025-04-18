public class RealEstate {
    private String city;
    private String suburb;
    private int bedrooms;
    private double price;
    private int rating;

    // creating constructors
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

@Override
    public String toString() {
    return city + " , " + suburb + " with " + bedrooms + " bed(s) and is Priced at P" + price + " with a star rating of" + rating + "stars";
    }
    }
