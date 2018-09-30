/**
 *Programmer Name: Hunter Danielson
 *Date Created:9/29/2018
 *Description of file:
 *This file creates the enum ItemType and provides utility to the associated abbreviations.
*/
package product;

//resource: Classmate: Gregorio Lozado "Provided assistance on how to declare the strings"
public enum ItemType {
  //declares abreviations
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");
  //prevents code from being overritten.
  public final String code;

  //allows for code to be rewritten when called.
  ItemType(String code) {
    this.code = code;
  }
}
