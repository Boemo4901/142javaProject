public class Apartment extends RealEstate implements Property{
    private int floorLevel;
    private boolean hasParking;

    public Apartment(String City, String suburb, int bedrooms, double price, int rating, int floorLevel, boolean hasParking) throws InvalidRatingException {
        super(city, suburb, bedrooms, price, rating,)
        this.floorLevel = floorLevel;
        this.hasParking = hasParking;
    }

    public int getFloorLevel(){
        return floorLevel;
    }

    public boolean hasParking(){
        return hasParking;
    }

    @Override
    public String getFullAddress(){
        return getSuburb() + "," + getCity() + "(Floor " + floorLevel +")";
    }

    @Override 
    public double getPrice(){
        return super.getPrice();
    }

    @Override
    public int getRating(){
        return super.getRating();
    }

    @Override
    public String toString(){
        return super.toString() + " on floor " + floorLevel;
    }
}