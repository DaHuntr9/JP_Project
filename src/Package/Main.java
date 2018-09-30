/*
Programmer Name: Hunter Danielson
Date Created:9/29/2018
Description of file:
This file implements all other files such as Product.java, Item.java, ItemType.java
Also creates objects of class product to be called and displayed to the user.


Modifications:
1#
Date modified:
Reason for modification:
*/
package Package;

//resource: Professor Vanselow "code provided"
public class Main {

  //main
  public static void main(String args[]) {
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    //changes the input to test the other functions implemented in Product.java
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

//class for widget that will utilize products classes
class Widget extends Product {

  public Widget(String name) {
    super(name);
  }
}