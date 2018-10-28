package product;
/**
 * Programmer Name: Hunter Danielson
 * Date Created:9/29/2018
 * Description of file: This file implements all other files such as product.java,
 * Item.java, ItemType.java.Also creates objects of class product to be called
 * and displayed to the user.
 *
 * Edited
 * Programmer Name: Hunter Danielson
 * Date Edited:10/27/2018
 * Description of file: used the main from the replit that was provided by Professor Venselow.
 * Added new functions into main.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  /**
   * Main method that instantiates the Array list of Products.
   * Sorts the Array List and then Prints them.
   */
  public static void main(String[] args) {
    // Write one line of code to create an ArrayList of products
    ArrayList<Product> listOfProducts;
    // Write one line of code to call testCollection and assign the result to the ArrayList
    listOfProducts = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(listOfProducts);
    // Call the print method on the ArrayList
    print(listOfProducts);
  }
  /**Step 15
   *Complete the header for the testCollection method here
   *this is a class to test if i can instantiate objects for audio player and
   *other classes.
  */

  public static ArrayList<Product> testCollection() {
    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);
    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  /**
   * Step 16
   * Create print method here.
   */

  public static void print(ArrayList<Product> list) {
    for (Product product : list) {
      System.out.println(product);
    }
  }
}
