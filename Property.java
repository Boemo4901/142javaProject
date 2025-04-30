/*Interface defining the core behaviours of a property
 *It retrieves the property's adress,price and rating.
*/

public interface Property{

  //Returns the full adress, the price and the rating of the property.
  String geFullAdress ();
  double getPrice ();
  int getRating ();
}
