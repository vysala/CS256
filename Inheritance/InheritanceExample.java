package InhertianceTopic;
/*The example below defines a Business class with private fields name and address. 
The Restaurant class is derived from Business and adds a rating private field with a getter and setter.
 * 
 */
class Business {

   private String name;
   private String address;
   
   public void setName(String busName) { 
      name = busName; 
   }
   
   public void setAddress(String busAddress) {
      address = busAddress; 
   }
   
   public String getDescription() {
      return name + " -- " + address;
   }
}

class Restaurant extends Business {
   private int rating;
   
   public void setRating(int userRating) {
      rating = userRating;
   }
   
   public int getRating() {
      return rating;
   }
}

public class InheritanceExample {
   public static void main(String[] args) {
      Business someBusiness = new Business();
      Restaurant favoritePlace = new Restaurant();

      someBusiness.setName("ACME");
      someBusiness.setAddress("4 Main St");

      favoritePlace.setName("Friends Cafe");
      favoritePlace.setAddress("500 W 2nd Ave");
      favoritePlace.setRating(5);

      System.out.println(someBusiness.getDescription());
      System.out.println(favoritePlace.getDescription());
      System.out.println("  Rating: " + favoritePlace.getRating());
   }
}