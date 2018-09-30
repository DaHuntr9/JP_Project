/*
Programmer Name: Hunter Danielson
Date Created:9/29/2018
Description of file:
This file creates class product, and implements associated functions into class product.

Modifications:
1#
Date modified:
Reason for modification:
*/

package Package;

import java.util.Date;

//abstract class called Product that will implement the Item's interface.
public abstract class Product implements Item {

  //variables/constants
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;
  private static Integer currentProductionNumber = 0;

  //constructor
  Product(String name) {
    //stores the input from the user into the Product class variable string name
    this.name = name;
    //sets the manufacturer name
    manufacturer = Item.manufacturer;
    //assigns a serial number from the currentProductionNumber.
    serialNumber = currentProductionNumber;
    //increments the classes production number.
    currentProductionNumber = currentProductionNumber + 1;
    //Set manufacturedOn as the current date and time.
    //resource: Classmate: Gregorio Lozadao
    manufacuredOn = new Date();
  }

  //function to display the associated data that is stored in the product class
  public String toString() {
    //formated output inside return statement
    return (
        "Manufacturer: " + manufacturer + '\n' +
            "Serial Number: " + serialNumber + '\n' +
            "Date: " + manufacuredOn + "\n" +
            "Name: " + name + "\n"
    );
  }

  //takes input as int and stores it into the product class in the int variable currentProductionNumber
  public void setProductionNumber(int currentProductionNumber) {
    //edits serial number because you will be changing the production number which in turn is the serial number
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

  //returns the date manufactured for the product
  public Date getManufactureDate() {
    return (manufacuredOn);
  }

  //returns the serialNumber for the product
  public int getSerialNumber() {
    return (serialNumber);
  }
}
