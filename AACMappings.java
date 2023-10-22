package mp5;

/**
 * Author: Livia Stein Freitas. 
 * Class description from the assignment website at https://accessibilityeducation.github.io/assignments/AAC/AAC.html
 * 
 * This is the class the keeps track of the complete set of AAC mappings. It will store the mapping of the images 
 * on the home page to the AACCategories. The class should keep track of the current category that is being displayed. 
 * Then given the current category ("" if the home screen or the category name for any other category),
 * it should respond appropriately for each of the methods.
 */
public class AACMappings {
  
  String current_category;
  AssociativeArray<String, String[]> mappings;

  public AACMappings(){
    this.current_category = "default";
    this.mappings = new AssociativeArray<String, String[]>(); //creates an array that maps categories to their arrays of images
  }

  /**
   * Adds the mapping to the current category (or the default category if that is the current category)
   */
  public void add(String imageLoc, String text){
    //STUB
  }

  /**
   * Gets the current category
   */
  public String getCurrentCategory(){
    return this.current_category;
  }

  /**
   * Provides an array of all the images in the current category
   */
  public String[] getImageLocs(){
    //STUB
    return new String[1];
  }

  /**
   * Given the image location selected, it determines the associated text with the image.
   */
  public String getText(){
    //STUB
    return new String();
  }

  /**
   * Determines if the image represents a category or text to speak
   */
  public boolean isCategory(String imageLoc){
    //STUB
    return true;
  }

  /**
   * Resets the current category of the AAC back to the default category
   */
  public void reset(){
    this.current_category = "default";
  }

  /**
   * Writes the ACC mappings stored to a file.
   * @param filename
   */
  public void writeToFile(String filename){

  }
}
