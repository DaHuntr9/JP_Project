//Package Statements

package product;

/**
 * Programmer Name: Hunter Danielson
 * Date Created:9/29/2018
 * Description of file: This file implements all other files such as product.java,
 * Item.java, ItemType.java.Also creates objects of class product to be called
 * and displayed to the user.
 */

//resource: Professor Vanselow "code provided"
public class Main {

  /**
   * Main to call all instances of widget and product.
   */
  public static void main(String[] args) {
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    //changes the input to test the other functions implemented in product.java
    w2.setName("Owen Wilson");
    w2.setProductionNumber(20);
    w2.getManufactureDate();
    w2.getName();
    w2.getSerialNumber();
    //calls to string to print again to test if functions operated correctly
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
  }
}