# JP_Project
This is a project that documents and tracks products in assembly line. This project will be updated over the semester. <br>
<br>
This is a Project that is provided by Oracle and the Scenario is below<br>
<br>
Scenario - OraclProduction<br>
OraclProduction Ltd are specialists in producing production line manufacturing plants.
They could be asked to create a production plant for any type of product ranging from a simple packaging
system to a variety of electronic devices.<br>
Recently they have been asked to create a production line for multimedia devices which include music
and movie players. They wish to employee you to design a template in Java for creating and recording all
future production line items. For this particular production facility you will only implement a concrete
class for music and movie players.<br>
Your task is to create a flexible structure that could be used in any production line. This structure would
then allow easy modification to handle different products.

#V1.1 <br>
Steps 1 to 3 were added.<br>
Basic functionality was added, and displays to console. <br>
Functions are currently:<br>
  Product(String name);//constructor<br>
  public String toString();<br>
  void setProductionNumber(int currentProductionNumber);<br>
  void setName(String name);<br>
  String getName();<br>
  Date getManufactureDate();<br>
  int getSerialNumber();<br>
 Files include:<br>
  Main.java //java class main<br>
  ItemType.java //enum<br>
  Item.java //interface<br>
  Product.java //java class  <br>
