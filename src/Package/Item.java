/*
Programmer Name: Hunter Danielson
Date Created:9/29/2018
Description of file: This file declares all functions and constants needed for Product.java

Modifications:
1#
Date modified:
Reason for modification:
*/

package Package;

import java.util.Date;

// all implemented in Product.java
// explanations of functions are in Product.java as well
public interface Item {

  //declared methods and constants to be used in Product.java
  String manufacturer = "OracleProduction";

  void setProductionNumber(int currentProductionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
