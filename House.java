import java.util.ArrayList;

public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * Constructs House by getting its name, address, floor numbers, and hasDining (whether it has a dining hall or not); Initializes name, address, floor numbers using a super class
   * @param name name of the resident (String)
   * @param address house address (String)
   * @param floor number of floors (String)
   * @param hasDining has dining or not (Boolean)
   */
  public House(String name, String address, int floor, boolean hasDining){
    super(name, address, floor);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDining;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Determines whether the House has dining hall or not
   * @return T/F if house has dining hall or not (Boolean)
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * The number of residents in the house
   * @return the count of number of residents in the house (int)
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * Throws an exception when the resident is already in the house; if not, it adds the resident to the house
   * @param name resident name (String)
   */
  public void moveIn(String name){
    if (residents.contains(name)){
      throw new RuntimeException(name + " is a resident of this house.");
    }else{
      this.residents.add(name);
    }
  }

  /**
   * Throws an exception when the resident is not in name; if not, this removes the resident
   * @param name resident name (String)
   * @return resident name who moved out (String)
   */
  public String moveOut(String name){
    if (!residents.contains(name)){
      throw new RuntimeException(name + " is not a resident of this house.");
    }else{
      this.residents.remove(name);
      return name;
    }
  }

  /**
   * Determines if a person is a resident in the House or not
   * @param person String name of resident
   * @return true/false if resident lives in the house or not
   */
  public boolean isResident(String person){
    if(residents.contains(name)){
      return true;
    }else{
      return false;
    }
  }
  
  public static void main(String[] args){
    House home = new House("Northrop", "Elm St.", 6, true);
    home.moveIn("Rya");
    home.moveIn("Joanne");
    home.moveIn("Maneeta");

    home.isResident("Rya");
    home.isResident("Jasmin");
  }
}