package ua.lviv.iot.firstLab;

public class Park {
    //fields
    private String adress;
    private double lengthOfCycleTrackInMetres;
    private double ticketPriceInHryvnias;
    private boolean playgroundPresence;
    private int numberOfBenches;
    public static final int MONEY_FOR_MAINTAINING_IN_HRYVNIAS = 1000000;
    protected String name;
    protected double parkAreaInHectares;


    //Getters
    public String getAdress() {
        return adress;
    }

    public double getLengthOfCycleTrack() {
        return lengthOfCycleTrackInMetres;
    }

    public double getTicketPrice() {
        return ticketPriceInHryvnias;
    }

    public boolean getPlaygroundPresence() {
        return playgroundPresence;
    }

    public int getNumberOfBenches() {
        return numberOfBenches;
    }

    //Setters
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setLengthOfCycleTrack(double lengthOfCycleTrackInMetres) {
        this.lengthOfCycleTrackInMetres = lengthOfCycleTrackInMetres;
    }

    public void setTicketPrice(double ticketPriceInHryvnias) {
        this.ticketPriceInHryvnias = ticketPriceInHryvnias;
    }

    public void setPlaygroundPresence(boolean playgroundPresence) {
        this.playgroundPresence = playgroundPresence;
    }

    public void setNumberOfBenches(int numberOfBenches) {
        this.numberOfBenches = numberOfBenches;
    }

    //Constructors
    public Park() {

    }

    public Park(String adress, double lengthOfCycleTrackInMetres, double ticketPrice, boolean playgroundPresence, int numberOfBenches, String name, double parkAreaInHectares) {
        this.adress = adress;
        this.lengthOfCycleTrackInMetres = lengthOfCycleTrackInMetres;
        this.ticketPriceInHryvnias = ticketPrice;
        this.playgroundPresence = playgroundPresence;
        this.numberOfBenches = numberOfBenches;
        this.name = name;
        this.parkAreaInHectares = parkAreaInHectares;

    }

    public Park(String adress, double lengthOfCycleTrack, double ticketPrice, boolean playgroundPresence) {
        this(adress, lengthOfCycleTrack, ticketPrice, playgroundPresence, 0, null, 0.0);
    }


    //toString method
    public String toString() {
        String newString;
        if (adress == null) {
            newString = " There is no information about this park \n";
        } else if (name == null && playgroundPresence == true) {
            newString = " This is the park at " + adress + "\n Length of cycle track: " + lengthOfCycleTrackInMetres + "\n Ticket price: " + ticketPriceInHryvnias + "\n The playground is present" + "\n";
        } else if (name == null && playgroundPresence == false) {
            newString = " This is the park at " + adress + "\n Length of cycle track: " + lengthOfCycleTrackInMetres + "\n Ticket price: " + ticketPriceInHryvnias + "\n The playground is absent" + "\n";
        } else if (playgroundPresence == true) {
            newString = " This is the park \n Name: " + name + "\n Adress: " + adress + "\n The area it takes in hectares is: " + parkAreaInHectares + "\n Length of cycle track: " + lengthOfCycleTrackInMetres + "\n Ticket price: " + ticketPriceInHryvnias + "\n Number of benches in the whole park: " + numberOfBenches + "\n The playground is present" + "\n";
        } else {
            newString = " This is the park \n Name: " + name + "\n Adress: " + adress + "\n The area it takes in hectares is: " + parkAreaInHectares + "\n Length of cycle track: " + lengthOfCycleTrackInMetres + "\n Ticket price: " + ticketPriceInHryvnias + "\n Number of benches in the whole park: " + numberOfBenches + "\n The playground is absent" + "\n";
        }
        return newString;
    }

    //methods which print the information about the static field
    public static void printStaticMoneyForMaintainingInHryvnias() {
        System.out.println(" Every year it takes " + MONEY_FOR_MAINTAINING_IN_HRYVNIAS + " hryvnias to maintain every park");
    }

    public void printMoneyForMaintainingInHryvnias() {
        System.out.println(" Every year it takes " + MONEY_FOR_MAINTAINING_IN_HRYVNIAS + " hryvnias to maintain this park");
    }


    //methods which reset values if needed
    public void resetValues(String newAdress, double newLengthOfCycleTrackInMetres, double newTicketPriceInHryvnias, boolean newPlaygroundPresence, int newNumberOfBenches, String newName, double newParkAreaInHectares) {
        this.adress = newAdress;
        this.lengthOfCycleTrackInMetres = newLengthOfCycleTrackInMetres;
        this.ticketPriceInHryvnias = newTicketPriceInHryvnias;
        this.playgroundPresence = newPlaygroundPresence;
        this.numberOfBenches = newNumberOfBenches;
        this.name = newName;
        this.parkAreaInHectares = newParkAreaInHectares;

    }

}


