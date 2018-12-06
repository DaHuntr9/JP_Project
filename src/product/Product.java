//Package Statements

package product;

//Import Statements

import java.util.Date;

/**
 * Programmer Name: Hunter Danielson Date Created:9/29/2018 Description of file: This file creates
 * class product, and implements associated functions into class product.
 */

//abstract class called product that will implement the Item's interface.
public abstract class Product implements Item, Comparable<Product> {

  //variables/constants
  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;
  private static Integer currentProductionNumber = 1;

  //constructor
  Product(String name) {
    //stores the input from the user into the product class variable string name
    this.name = name;
    //sets the manufacturer name
    manufacturer = Item.manufacturer;
    //assigns a serial number from the currentProductionNumber.
    serialNumber = currentProductionNumber;
    /**
     * increments the classes production number.
     * Find Bugs says that this is improper use of static Integers,
     * but when I declare it as a int the counter doesn't increase.
     * And I also don't know a work around other then declaring it static,
     * and as a Integer which was specified in the oracle doc.
     */
    //I don't understand how this is considered dodgy code.
    currentProductionNumber++;
    //Set manufacturedOn as the current date and time.
    //resource: Classmate: Gregorio Lozadao
    Date currentdate = new Date();
    manufacturedOn = currentdate;
  }

  /**
   * function to display the associated data that is stored in the product class.
   */
  public String toString() {
    //formated output inside return statement
    return (
        "Manufacturer : " + manufacturer + '\n'
            + "Serial Number : " + serialNumber + '\n'
            + "Date : " + manufacturedOn + "\n"
            + "Name : " + name);
  }

  /**
   * takes input as int and stores it into the product class, in the int variable
   * currentProductionNumber.
   */
  public void setProductionNumber(int currentProductionNumber) {
    /*edits serial number because you will be changing the
     production number which in turn is the serial number
    */
    this.serialNumber = currentProductionNumber;
  }

  //sets the name for the Products name when called and displays it to the user
  public void setName(String name) {
    this.name = name;
  }

  //returns the name for the product
  public String getName() {
    return (this.name);
  }

  /**
   * returns the date manufactured for the product.
   */
  public Date getManufactureDate() {
    /**
     * a Date data type must be used as given by the oracle doc,
     * there is no way that we have been taught to work around this.
     * I don't know how to fix the error that code bugs is giving me.
     */
    return (manufacturedOn);
  }

  //returns the serialNumber for the product
  public int getSerialNumber() {
    return (serialNumber);
  }

  //provided by classmate Carlos Perez
  public int compareTo(Product o) {
    return this.name.compareTo(o.getName());
  }
}
