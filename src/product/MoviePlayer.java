package product;

/**
 * Programmer Name: Hunter Danielson
 * Date Created:10/27/2018
 * Description of file: Creates a class of movie player and will store other objects
 * as fields. it also calls the constructor from the previous class.
 */

public class MoviePlayer extends Product implements MultimediaControl {
  Screen screen;
  MonitorType monitorType;

  /**
   * Creates a Class movie player with the constructor of the previous class.
   * @param name name of the product.
   * @param screen type of display panel with the screen class parameters.
   * @param monitorType specifies the type of monitor.
   */
  public MoviePlayer(String name,Screen screen,MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }



  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Playing Previous");
  }

  public void next() {
    System.out.println("Playing Next");
  }

  /**
   * Prints the monitor and the screen panel so that the assembly line is aware what
   * parts are in this product.
   * @return
   */
  public String toString() {
    return (
        super.toString() + '\n'
            + "Screen : " + screen + '\n'
            + "Monitor Type : " + monitorType);
  }
}
