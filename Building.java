public class Building{

    protected String name = "<Name Unknown>"; //Building name
    protected String address = "<Address Unknown>"; //Address name
    protected int nFloors = 1; //number of floors

    /**
     * Constructs building & initializes name, address, and floors.
     * @param name name of building (String)
     * @param address address of building (String)
     * @param nFloors number of floors (int)
     */
    public Building(String name, String address, int nFloors){
        if (name != null) {this.name = name;}
        if (address != null) {this.address = address;}
        if (nFloors < 1){
            throw new RuntimeException("Oops... Not able to construct a Building");
        }
        this.nFloors = nFloors;
    }
    
    /**
    * Returns the building name
    * @return name of building (String)
    */
    public String getName(){
        return this.name;
    }

    /**
     * Returns building address
     * @return address of building (String)
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * Returns number of floors
     * @return number of floors in the building (int)
     */
    public int getFloors(){
        return this.nFloors;
    }

    /**
     * Returns the building's name, address, and number of floors
     */
    public String toString(){
        return this.name + " is located at " + this.address + " and has " + this.nFloors + " floors.";
    }

    public static void main(String[] args){
        Building throp = new Building("Northrop House", "49 Elm Street, Northampton, MA 01063", 6);
        System.out.println(throp);
    }
}