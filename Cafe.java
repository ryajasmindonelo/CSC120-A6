public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Constructs name, address, and number of floors
     * Constructs Cafe with name, address, number of floors, number of coffee ounces remaining, number of sugar packets remaining, number of "splashes" of cream remaining, and number of cups remaining in inventory
     * @param name name of cafe (String)
     * @param address address of the cafe (String)
     * @param numOfFloors number of floors in the cafe building (int)
     * @param nCoffeeOunces number of coffee ounces remaining in inventory (int)
     * @param nSugarPackets number of sugar packets remaining in inventory (int)
     * @param nCreams number of creams remaining in inventory (int)
     * @param nCups number of cups remaining in inventory (int)
     */
    public Cafe(String name, String address, int numOfFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        super(name, address, numOfFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("Yay! Cafe built!");
    }
    
    /**
     * Throws an exception when the coffee ounces, the sugar packets, and the creams run out; if not, the number decreases
     * @param numCoffeeOunces number of coffee ounces (int)
     * @param nSugarPackets number of sugar packets (int)
     * @param nCreams number of creams (int)
     */
    public void sellCoffee(int numCoffeeOunces, int nSugarPackets, int nCreams){
        if(nCoffeeOunces - numCoffeeOunces <= 0 || this.nSugarPackets - nSugarPackets <= 0 || this.nCreams - nCreams <= 0) {
            throw new RuntimeException("No more remaining");
        }else {
            this.nCoffeeOunces-=numCoffeeOunces;
            this.nSugarPackets-=nSugarPackets;
            this.nCreams-=nCreams;
            this.nCups-=1;
        }
    }

    /**
     * Adds coffee ounces, sugar packets, creams, cups to inventory
     * @param nCoffeeOunces number of coffee ounces (int)
     * @param nSugarPackets number of sugar packets (int)
     * @param nCreams number of creams (int)
     * @param nCups number of cups (int)
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces+=nCoffeeOunces;
        this.nSugarPackets+=nSugarPackets;
        this.nCreams+=nCreams;
        this.nCups+=nCups;
    }

    public static void main(String[] args){
        Cafe compassCafe = new Cafe("Compass Cafe in Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 1, 10, 30, 40, 2);
        compassCafe.restock(100, 100, 500, 1000);
    }
}