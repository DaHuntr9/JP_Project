package product;

/**
 * Programmer Name: Hunter Danielson
 * Date Created:10/27/2018
 * Description of file: Creates a class of Screen that will
 * store all screen information to be returned/printed as well.
 */

public class Screen implements ScreenSpec {

  String resolution;
  int refreshrate;
  int responsetime;

  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution() {
    return this.resolution;
  }

  public int getRefreshRate() {
    return this.refreshrate;
  }

  public int getResponseTime() {
    return this.responsetime;
  }

  /**
   * Prints the information for the screen panel inside the monitor.
   * @return
   */
  public String toString() {
    //formatted output inside return statement
    return (
        "Resolution : " + resolution + '\n'
            + "Refresh rate : " + refreshrate + '\n'
            + "Response time : " + responsetime);
  }
}