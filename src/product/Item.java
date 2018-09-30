//Package Statements

package product;

//Import Statements

import java.util.Date;

/**
 * Programmer Name: Hunter Danielson
 * Date Created:9/29/2018
 * Description of file: This file declares
 * all functions and constants needed for product.java
 */

// all functions are implemented in product.java
// explanations of functions are in product.java as well
public interface Item {

  //declared methods and constants to be used in product.java
  String manufacturer = "OracleProduction";

  void setProductionNumber(int currentProductionNumber);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
