public class Apartment extends RealEstate{
  private int floorLevel;

  public Apartment (String city, String suburb, int bedrooms,Int price,Int rating,Int floorLevel )thows invalidRatingException {
    super( city, suburb ,bedrooms ,price,rating );
  }
  public int getFloorLevel(){
    return floorLevel;
      }
  @overide
  public String toString(){
    return super.tostring()+", located on floor "+floorLevel;
  }
}
