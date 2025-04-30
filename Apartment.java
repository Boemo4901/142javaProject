/*Class representing an Apartment, which is a specialized type of RealEstate
 * Included additional apartment-specific attributes such a floor level.
 */

public class Apartment extends RealEstate{
  private int floorLevel;

  public Apartment (String city, String suburb, int bedrooms,double price,int rating,int floorLevel ) throws InvalidRatingException {
    super( city, suburb, bedrooms, price, rating );
    this.floorLevel = floorLevel;

  }
  public int getFloorLevel() {
    return floorLevel;
  }

  // Returns a formatted string representation of the apartment.
  @Override
  public String toString(){
    return super.toString() + ", located on floor " + floorLevel;
  }
}
