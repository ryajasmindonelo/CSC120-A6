import java.util.Hashtable;

public class Library extends Building{
    private Hashtable<String, Boolean> collection;
    
    /**
     * Constructs a Library
     * @param library library name (String)
     * @param address library address (String)
     * @param numOfFloors number of floors in the library (int)
     */
    public Library(String library, String address, int numOfFloors){
      super(library, address, numOfFloors);
      this.collection = new Hashtable<>();
      System.out.println("Yay! Library built!");
    }
    
    /**
     * Adds title to collection of titles; this throws an exception when title is in collection
     * @param title name of book and author (String)
     */
    public void addTitle(String title){
      if (this.collection.containsKey(title)){
        throw new RuntimeException("Unable to find in the collection");
      }else{
        this.collection.put(title, true);
      }
    }
    
    /**
     * Throws an exception when title is not in collection; if not, this removes the title from the collection
     * @param title name of book and author (String)
     * @return title which was removed (String)
     */
    public String removeTitle(String title){
      if (!this.collection.containsKey(title)){
        throw new RuntimeException("Unable to view in the system");
      }
      this.collection.remove(title);
      return title;
    }

    /**
     * Throws an exception when value is false; if not, this sets value to false
     * @param title book and author (String)
     */
    public void checkOut(String title){
      if (!this.collection.get(title)){
        throw new RuntimeException("Unable to check out");
      }else{
        this.collection.replace(title, false);
      }
    }

    /**
     * Throws an exception when the title is in collection; if not, the value becomes true
     * @param title String name of book and author
     */
    public void returnBook(String title){
      Library NeilsonLibrary = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);
      NeilsonLibrary.removeTitle("Book Lovers by Emily Henry");
      if (this.collection.containsKey(title)){
        throw new RuntimeException("Found in the system");
      }else{
        this.collection.replace(title, true);
      }
    }

    /**
     * Returns a Boolean when the collection has a title
     * @param title name of book (String)
     * @return T/F if collection has a title (boolean)
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    }

    /**
     * Returns a value if the title is in the collection
     * @param title name of title and book (String)
     * @return T/F value if the title is currently available, false otherwise
     */
    public boolean isAvailable(String title){
      return this.collection.get(title);
    }

    /**
     * Prints out the collection
     */
    public void printCollection(){
      System.out.println(this.collection.toString());
    }

    public static void main(String[] args){
      Library NeilsonLibrary = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);
      NeilsonLibrary.addTitle("Book Lovers by Emily Henry");
      NeilsonLibrary.addTitle("One Last Stop by Casey McQuiston");
      NeilsonLibrary.addTitle("The Seven Husbands of Evelyn Hugo by Taylor Jenkins Reid");
      NeilsonLibrary.checkOut("The Seven Husbands of Evelyn Hugo by Taylor Jenkins Reid");
      NeilsonLibrary.printCollection();
    }
  }