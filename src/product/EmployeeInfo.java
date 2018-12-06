package product;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Programmer Name: Hunter Danielson
 * Date Created:12/05/2018
 * Description of file: The program is
 * required to create an audit trail on its tests of the production line so that it records which
 * employee ran the test.
 */
public class EmployeeInfo {

  //requirement 18 fields
  StringBuilder name;
  String code;

  //requirement 19 fields
  String deptId;
  Pattern p;
  Scanner in;

  public String getDeptId() {
    return this.deptId;
  }

  private void setDeptId() {
    getId();
  }

  private String getId() {
    System.out.print("Please enter the department ID: ");
    String tempString = this.in.nextLine();
    if (validId(tempString)) {
      this.deptId = tempString;
    } else {
      this.deptId = "None01";
    }
    return this.deptId;
  }

  private boolean validId(String id) {
    if (p.matcher(id).matches()) {
      return true;
    } else {
      return false;
    }
  }


  EmployeeInfo() {
    //I don't understand why it is bad to rely on default encoding
    in = new Scanner(System.in);
    p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setName();
    setDeptId();

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return this.code;
  }

  private void setName() {
    this.code = inputName();
  }

  private void createEmployeeCode(StringBuilder name) {
    int spaceLocation = name.indexOf(" ");
    String firstInital = name.substring(0, 1);
    spaceLocation++;
    String surName = name.substring(spaceLocation);
    this.code = firstInital + surName;
  }

  private String inputName() {
    //I don't understand why it is bad to rely on default encoding
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your first and last name: ");
    StringBuilder tempString = new StringBuilder(input.nextLine());
    if (checkName(tempString)) {
      createEmployeeCode(tempString);
    } else {
      this.code = "guest";
    }
    return getCode();
  }

  // Checks if a null value if no space is present
  private boolean checkName(StringBuilder name) {
    if (!(name.indexOf(" ") == -1)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    String output = "Employee Code : " + this.getCode() + "\nDepartment Number : " + this.deptId;
    return output;
  }
}
