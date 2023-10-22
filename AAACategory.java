package mp5;

/**
 * Author: Livia Stein Freitas. 
 * Class description from the assignment website at https://accessibilityeducation.github.io/assignments/AAC/AAC.html
 * 
 * This portion of the AAC represents a single category of items in the AAC. It stores the mapping between the image 
 * location and the text that should be spoken and the name of the category.
 */

public class AAACategory {
  
  AssociativeArray<String,String> location_to_text;
  String category_name;

  public AAACategory(String name){
    this.category_name = name;
    this.location_to_text = new AssociativeArray<>();
  }

  /**
   * Adds the mapping of the imageLoc to the text to the category.
   */
  public void addItem(String imageLoc, String text){

  }

  /**
   * Returns the name of the category
   */
  public String getCategory(){
    //STUB
    return new String();
  }

  /**
   * Returns an array of all the images in the category
   * @return
   */
    public String[] getImages(){
    //STUB
    return new String[1];
  }

  /**
   * Returns the text associated with the given image loc in this category
   */
    public String getText(){
    //STUB
    return new String();
  }

  /**
   * Determines if the provided image is stored in the category
   */
  public boolean hasImage(){
    //STUB
    return true;
  }
  
}
