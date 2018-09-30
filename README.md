# JP_Project
This is a project that documents and tracks products in assembly line. This project will be updated over the semester. 

This is a Project that is provided by Oracle and the Scenario is below

Scenario - OraclProduction
OraclProduction Ltd are specialists in producing production line manufacturing plants.
They could be asked to create a production plant for any type of product ranging from a simple packaging
system to a variety of electronic devices.
Recently they have been asked to create a production line for multimedia devices which include music
and movie players. They wish to employee you to design a template in Java for creating and recording all
future production line items. For this particular production facility you will only implement a concrete
class for music and movie players.
Your task is to create a flexible structure that could be used in any production line. This structure would
then allow easy modification to handle different products.

#V1.1 
Steps 1 to 3 were added.
Basic functionality was added, and displays to console. 
Functions are currently:
  Product(String name);//constructor
  public String toString();
  void setProductionNumber(int currentProductionNumber);
  void setName(String name);
  String getName();
  Date getManufactureDate();
  int getSerialNumber();
 Files include:
  Main.java //java class main
  ItemType.java //enum
  Item.java //interface
  Product.java //java class
