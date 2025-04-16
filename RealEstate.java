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
            throw new InvalidRaTingException("Rating must be between 1 ans 5");
        }
        this.city=city;
        this.surbub=surbub;
        this.bedrooms=bedrooms;
        this.price=price;
        this.rating=rating;

    }
    

    //getters and setters
    public String getCity(){
        return city;
    }

    public String getsuburb(){
        return suburb;

    }

    public  int getBedroom(){

        
    //print out/return 
