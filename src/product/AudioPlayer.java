package product;
/**
 * Programmer Name: Hunter Danielson
 * Date Created:10/27/2018
 * Description of file: Creates a class for Audio Player to be made and provides functionality.
 * This class also extends Product and implements the functions from
 * MultimediaControl.
 */

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  /**
   * The audio player is constructed so that the data can be printed out
   * for the assembly line.
   * @param name is the name of the product
   * @param audioSpecification says what type of audio device it is such as MP3, etc.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.Audio;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stoping");
  }

  public void previous() {
    System.out.println("Playing Previous");
  }

  public void next() {
    System.out.println("Playing Next");
  }

  /**
   * To String to print out the data for the item on the assembly line.
   * @return
   */
  public String toString() {
    return (super.toString() + "\n"
        + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType);
  }

}
